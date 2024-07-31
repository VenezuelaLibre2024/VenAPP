.class public final Lkb/g0;
.super Lkb/b;
.source "SourceFile"


# instance fields
.field private final a:Lkb/i0;

.field private final b:Lxb/b;

.field private final c:Lxb/a;

.field private final d:Ljava/lang/Integer;


# direct methods
.method private constructor <init>(Lkb/i0;Lxb/b;Lxb/a;Ljava/lang/Integer;)V
    .locals 0

    invoke-direct {p0}, Lkb/b;-><init>()V

    iput-object p1, p0, Lkb/g0;->a:Lkb/i0;

    iput-object p2, p0, Lkb/g0;->b:Lxb/b;

    iput-object p3, p0, Lkb/g0;->c:Lxb/a;

    iput-object p4, p0, Lkb/g0;->d:Ljava/lang/Integer;

    return-void
.end method

.method public static a(Lkb/i0$a;Lxb/b;Ljava/lang/Integer;)Lkb/g0;
    .locals 2

    sget-object v0, Lkb/i0$a;->d:Lkb/i0$a;

    if-eq p0, v0, :cond_1

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "For given Variant "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " the value of idRequirement must be non-null"

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    if-ne p0, v0, :cond_3

    if-nez p2, :cond_2

    goto :goto_1

    :cond_2
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "For given Variant NO_PREFIX the value of idRequirement must be null"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    :goto_1
    invoke-virtual {p1}, Lxb/b;->b()I

    move-result v0

    const/16 v1, 0x20

    if-ne v0, v1, :cond_4

    invoke-static {p0}, Lkb/i0;->a(Lkb/i0$a;)Lkb/i0;

    move-result-object p0

    new-instance v0, Lkb/g0;

    invoke-static {p0, p2}, Lkb/g0;->b(Lkb/i0;Ljava/lang/Integer;)Lxb/a;

    move-result-object v1

    invoke-direct {v0, p0, p1, v1, p2}, Lkb/g0;-><init>(Lkb/i0;Lxb/b;Lxb/a;Ljava/lang/Integer;)V

    return-object v0

    :cond_4
    new-instance p0, Ljava/security/GeneralSecurityException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lxb/b;->b()I

    move-result p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static b(Lkb/i0;Ljava/lang/Integer;)Lxb/a;
    .locals 4

    invoke-virtual {p0}, Lkb/i0;->b()Lkb/i0$a;

    move-result-object v0

    sget-object v1, Lkb/i0$a;->d:Lkb/i0$a;

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    new-array p0, v2, [B

    invoke-static {p0}, Lxb/a;->a([B)Lxb/a;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Lkb/i0;->b()Lkb/i0$a;

    move-result-object v0

    sget-object v1, Lkb/i0$a;->c:Lkb/i0$a;

    const/4 v3, 0x5

    if-ne v0, v1, :cond_1

    invoke-static {v3}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object p0

    invoke-virtual {p0, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    move-result-object p0

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object p0

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p0

    invoke-static {p0}, Lxb/a;->a([B)Lxb/a;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-virtual {p0}, Lkb/i0;->b()Lkb/i0$a;

    move-result-object v0

    sget-object v1, Lkb/i0$a;->b:Lkb/i0$a;

    if-ne v0, v1, :cond_2

    invoke-static {v3}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object p0

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    move-result-object p0

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object p0

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p0

    invoke-static {p0}, Lxb/a;->a([B)Lxb/a;

    move-result-object p0

    return-object p0

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unknown Variant: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lkb/i0;->b()Lkb/i0$a;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
