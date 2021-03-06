package develop.com.jackmytour.facebook;

import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.credential.CredentialsMatcher;

public class FacebookCredentialsMatcher implements CredentialsMatcher {
	 
/**
* Just confirms that token is the right type - credentials checking is done by facebook OAuth
*/
	@Override
	public boolean doCredentialsMatch(AuthenticationToken token, AuthenticationInfo info) {
		if(info instanceof FacebookAuthenticationInfo){
			return true;
		}
		return false;
	}
 
}