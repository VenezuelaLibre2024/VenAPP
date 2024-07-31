package io.flutter.plugins.googlemobileads.usermessagingplatform;

import cb.e;
import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class UserMessagingCodec extends StandardMessageCodec {
    private static final byte VALUE_CONSENT_DEBUG_SETTINGS = -126;
    private static final byte VALUE_CONSENT_FORM = -125;
    private static final byte VALUE_CONSENT_REQUEST_PARAMETERS = -127;
    private static final byte VALUE_FORM_ERROR = -124;
    private final Map<Integer, cb.b> consentFormMap = new HashMap();

    private List<String> asList(Object obj) {
        if (obj == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                if (obj2 instanceof String) {
                    arrayList.add((String) obj2);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void disposeConsentForm(cb.b bVar) {
        this.consentFormMap.remove(Integer.valueOf(bVar.hashCode()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.flutter.plugin.common.StandardMessageCodec
    public Object readValueOfType(byte b10, ByteBuffer byteBuffer) {
        switch (b10) {
            case -127:
                return new ConsentRequestParametersWrapper((Boolean) readValueOfType(byteBuffer.get(), byteBuffer), (ConsentDebugSettingsWrapper) readValueOfType(byteBuffer.get(), byteBuffer));
            case -126:
                return new ConsentDebugSettingsWrapper((Integer) readValueOfType(byteBuffer.get(), byteBuffer), asList(readValueOfType(byteBuffer.get(), byteBuffer)));
            case -125:
                return this.consentFormMap.get((Integer) readValueOfType(byteBuffer.get(), byteBuffer));
            case -124:
                Integer num = (Integer) readValueOfType(byteBuffer.get(), byteBuffer);
                return new e(num.intValue(), (String) readValueOfType(byteBuffer.get(), byteBuffer));
            default:
                return super.readValueOfType(b10, byteBuffer);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void trackConsentForm(cb.b bVar) {
        this.consentFormMap.put(Integer.valueOf(bVar.hashCode()), bVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.flutter.plugin.common.StandardMessageCodec
    public void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        Object b10;
        if (obj instanceof ConsentRequestParametersWrapper) {
            byteArrayOutputStream.write(-127);
            ConsentRequestParametersWrapper consentRequestParametersWrapper = (ConsentRequestParametersWrapper) obj;
            writeValue(byteArrayOutputStream, consentRequestParametersWrapper.getTfuac());
            b10 = consentRequestParametersWrapper.getDebugSettings();
        } else if (obj instanceof ConsentDebugSettingsWrapper) {
            byteArrayOutputStream.write(-126);
            ConsentDebugSettingsWrapper consentDebugSettingsWrapper = (ConsentDebugSettingsWrapper) obj;
            writeValue(byteArrayOutputStream, consentDebugSettingsWrapper.getDebugGeography());
            b10 = consentDebugSettingsWrapper.getTestIdentifiers();
        } else if (obj instanceof cb.b) {
            byteArrayOutputStream.write(-125);
            b10 = Integer.valueOf(obj.hashCode());
        } else {
            if (!(obj instanceof e)) {
                super.writeValue(byteArrayOutputStream, obj);
                return;
            }
            byteArrayOutputStream.write(-124);
            e eVar = (e) obj;
            writeValue(byteArrayOutputStream, Integer.valueOf(eVar.a()));
            b10 = eVar.b();
        }
        writeValue(byteArrayOutputStream, b10);
    }
}
