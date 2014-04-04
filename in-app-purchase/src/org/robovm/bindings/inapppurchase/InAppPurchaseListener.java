
package org.robovm.bindings.inapppurchase;

import org.robovm.apple.foundation.NSError;
import org.robovm.apple.storekit.SKPaymentTransaction;
import org.robovm.apple.storekit.SKProduct;
import org.robovm.apple.storekit.SKRequest;

/** Listener for common in-app purchase events. */
public interface InAppPurchaseListener {
	/** Called when the requested products have been received. */
	public void productsReceived (SKProduct[] products);

	/** Called when the products request has failed.
	 * 
	 * @param request The original request.
	 * @param error Error information. */
	public void productsRequestFailed (SKRequest request, NSError error);

	/** Called when the transaction was completed successfully.
	 * 
	 * @param transaction */
	public void transactionCompleted (SKPaymentTransaction transaction);

	/** Called when the transaction has failed.
	 * 
	 * @param transaction */
	public void transactionFailed (SKPaymentTransaction transaction);

	/** Called when the already completed transactions have been successfully restored.
	 * 
	 * @param transaction */
	public void transcationRestored (SKPaymentTransaction transaction);
}
