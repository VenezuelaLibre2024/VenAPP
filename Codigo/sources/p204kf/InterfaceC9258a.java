package p204kf;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: kf.a */
/* loaded from: classes2.dex */
public @interface InterfaceC9258a {
    boolean deserialize() default true;

    boolean serialize() default true;
}
