package binary;

import exceptions.NotImplementedException;

public class Binary
{
	private String binaryString;
	/**
	 * Takes in a binary string representing some number.
	 * @param rawInput
	 */
	public Binary( String rawInput ) {
		if ( rawInput == null ) {
			throw new NullPointerException();
		}
		
		this.binaryString = this.validateInput( rawInput );
	}
	
	/**
	 * Returns an Integer represented by the given binary string.
	 * @return
	 */
	public Integer getDecimal() {
		if ( this.binaryString == null || this.binaryString.isEmpty( ) ) {
			return 0;
		}
		
		String temp = new StringBuilder(this.binaryString).reverse( ).toString( );
		Integer result = 0;
		for ( int i = 0 ; i < temp.length( ) ; i++ ) {
			result += Character.digit( temp.charAt( i ), 2 ) * ((Double) Math.pow( 2, i ) ).intValue( );
		}
		
		return result;
	}
	
	/**
	 * Validates input.
	 * Input is valid if every Character in the string is a '0' or '1'.
	 * Return empty string if the string is invalid.
	 * @param rawInput
	 * @return
	 */
	private String validateInput( String rawInput ) {
		if ( rawInput == null || rawInput.isEmpty( ) ) {
			return "";
		}
		
		for ( int i = 0 ; i < rawInput.length( ) ; i++ ) {
			if ( !( rawInput.charAt( i ) == '0' || rawInput.charAt( i ) == '1' ) ) {
				return "";
			}
		}
		return rawInput;
	}
}
