.class public Lrb/i$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lrb/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field private a:Lrb/l;

.field private b:Lxb/b;

.field private c:Ljava/lang/Integer;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lrb/i$b;->a:Lrb/l;

    iput-object v0, p0, Lrb/i$b;->b:Lxb/b;

    iput-object v0, p0, Lrb/i$b;->c:Ljava/lang/Integer;

    return-void
.end method

.method synthetic constructor <init>(Lrb/i$a;)V
    .locals 0

    invoke-direct {p0}, Lrb/i$b;-><init>()V

    return-void
.end method

.method private b()Lxb/a;
    .locals 4

    iget-object v0, p0, Lrb/i$b;->a:Lrb/l;

    invoke-virtual {v0}, Lrb/l;->f()Lrb/l$d;

    move-result-object v0

    sget-object v1, Lrb/l$d;->e:Lrb/l$d;

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    new-array v0, v2, [B

    invoke-static {v0}, Lxb/a;->a([B)Lxb/a;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Lrb/i$b;->a:Lrb/l;

    invoke-virtual {v0}, Lrb/l;->f()Lrb/l$d;

    move-result-object v0

    sget-object v1, Lrb/l$d;->d:Lrb/l$d;

    const/4 v3, 0x5

    if-eq v0, v1, :cond_3

    iget-object v0, p0, Lrb/i$b;->a:Lrb/l;

    invoke-virtual {v0}, Lrb/l;->f()Lrb/l$d;

    move-result-object v0

    sget-object v1, Lrb/l$d;->c:Lrb/l$d;

    if-ne v0, v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lrb/i$b;->a:Lrb/l;

    invoke-virtual {v0}, Lrb/l;->f()Lrb/l$d;

    move-result-object v0

    sget-object v1, Lrb/l$d;->b:Lrb/l$d;

    if-ne v0, v1, :cond_2

    invoke-static {v3}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    move-result-object v0

    iget-object v1, p0, Lrb/i$b;->c:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-static {v0}, Lxb/a;->a([B)Lxb/a;

    move-result-object v0

    return-object v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown HmacParameters.Variant: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lrb/i$b;->a:Lrb/l;

    invoke-virtual {v2}, Lrb/l;->f()Lrb/l$d;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_0
    invoke-static {v3}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    move-result-object v0

    iget-object v1, p0, Lrb/i$b;->c:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-static {v0}, Lxb/a;->a([B)Lxb/a;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a()Lrb/i;
    .locals 8

    iget-object v0, p0, Lrb/i$b;->a:Lrb/l;

    if-eqz v0, :cond_5

    iget-object v1, p0, Lrb/i$b;->b:Lxb/b;

    if-eqz v1, :cond_5

    invoke-virtual {v0}, Lrb/l;->d()I

    move-result v0

    iget-object v1, p0, Lrb/i$b;->b:Lxb/b;

    invoke-virtual {v1}, Lxb/b;->b()I

    move-result v1

    if-ne v0, v1, :cond_4

    iget-object v0, p0, Lrb/i$b;->a:Lrb/l;

    invoke-virtual {v0}, Lrb/l;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lrb/i$b;->c:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot create key without ID requirement with parameters with ID requirement"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    iget-object v0, p0, Lrb/i$b;->a:Lrb/l;

    invoke-virtual {v0}, Lrb/l;->g()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lrb/i$b;->c:Ljava/lang/Integer;

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot create key with ID requirement with parameters without ID requirement"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_1
    invoke-direct {p0}, Lrb/i$b;->b()Lxb/a;

    move-result-object v5

    new-instance v0, Lrb/i;

    iget-object v3, p0, Lrb/i$b;->a:Lrb/l;

    iget-object v4, p0, Lrb/i$b;->b:Lxb/b;

    iget-object v6, p0, Lrb/i$b;->c:Ljava/lang/Integer;

    const/4 v7, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v7}, Lrb/i;-><init>(Lrb/l;Lxb/b;Lxb/a;Ljava/lang/Integer;Lrb/i$a;)V

    return-object v0

    :cond_4
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Key size mismatch"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "Cannot build without parameters and/or key material"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public c(Ljava/lang/Integer;)Lrb/i$b;
    .locals 0

    iput-object p1, p0, Lrb/i$b;->c:Ljava/lang/Integer;

    return-object p0
.end method

.method public d(Lxb/b;)Lrb/i$b;
    .locals 0

    iput-object p1, p0, Lrb/i$b;->b:Lxb/b;

    return-object p0
.end method

.method public e(Lrb/l;)Lrb/i$b;
    .locals 0

    iput-object p1, p0, Lrb/i$b;->a:Lrb/l;

    return-object p0
.end method
