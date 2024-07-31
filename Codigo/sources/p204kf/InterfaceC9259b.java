package p204kf;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: kf.b */
/* loaded from: classes2.dex */
public @interface InterfaceC9259b {
    boolean nullSafe() default true;

    Class<?> value();
}
