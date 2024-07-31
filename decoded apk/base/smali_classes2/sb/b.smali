.class public final Lsb/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrb/g;


# static fields
.field private static final b:Lob/b$b;


# instance fields
.field private final a:Lrb/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lob/b$b;->ALGORITHM_NOT_FIPS:Lob/b$b;

    sput-object v0, Lsb/b;->b:Lob/b$b;

    return-void
.end method

.method public constructor <init>(Lrb/a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lsb/b;->b:Lob/b$b;

    invoke-virtual {v0}, Lob/b$b;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Lsb/b;->a:Lrb/a;

    return-void

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Can not use AES-CMAC in FIPS-mode."

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
