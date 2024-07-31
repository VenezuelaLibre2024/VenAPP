.class public final Lwb/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljb/a;


# static fields
.field public static final b:Lob/b$b;


# instance fields
.field private final a:Llb/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lob/b$b;->ALGORITHM_REQUIRES_BORINGCRYPTO:Lob/b$b;

    sput-object v0, Lwb/c;->b:Lob/b$b;

    return-void
.end method

.method public constructor <init>([B)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lwb/c;->b:Lob/b$b;

    invoke-virtual {v0}, Lob/b$b;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Llb/b;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Llb/b;-><init>([BZ)V

    iput-object v0, p0, Lwb/c;->a:Llb/b;

    return-void

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available."

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public a([B[B)[B
    .locals 2

    const/16 v0, 0xc

    invoke-static {v0}, Lwb/p;->c(I)[B

    move-result-object v0

    iget-object v1, p0, Lwb/c;->a:Llb/b;

    invoke-virtual {v1, v0, p1, p2}, Llb/b;->b([B[B[B)[B

    move-result-object p1

    return-object p1
.end method

.method public b([B[B)[B
    .locals 2

    const/16 v0, 0xc

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    iget-object v1, p0, Lwb/c;->a:Llb/b;

    invoke-virtual {v1, v0, p1, p2}, Llb/b;->a([B[B[B)[B

    move-result-object p1

    return-object p1
.end method
