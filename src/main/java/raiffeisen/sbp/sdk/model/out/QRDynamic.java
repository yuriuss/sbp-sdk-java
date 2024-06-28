package raiffeisen.sbp.sdk.model.out;

import raiffeisen.sbp.sdk.model.QRType;

import java.math.BigDecimal;

public final class QRDynamic extends QR {

    public QRDynamic(String order, BigDecimal amount) {
        this.order = order;
        this.amount = amount;
        setQrType(QRType.QRDynamic);
    }

    @Override
    public QR newInstance() {
        QRDynamic qrDynamic = new QRDynamic(order, amount);
        qrDynamic.setAccount(account);
        qrDynamic.setAdditionalInfo(additionalInfo);
        qrDynamic.setCreateDate(createDate);
        qrDynamic.setPaymentDetails(paymentDetails);
        qrDynamic.setQrExpirationDate(qrExpirationDate);
        qrDynamic.setQrDescription(qrDescription);
        return qrDynamic;
    }
}
