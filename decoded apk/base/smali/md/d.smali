.class public interface abstract annotation Lmd/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/annotation/Annotation;


# annotations
.annotation system Ldalvik/annotation/AnnotationDefault;
    value = .subannotation Lmd/d;
        intEncoding = .enum Lmd/d$a;->DEFAULT:Lmd/d$a;
    .end subannotation
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lmd/d$a;
    }
.end annotation


# virtual methods
.method public abstract intEncoding()Lmd/d$a;
.end method

.method public abstract tag()I
.end method
