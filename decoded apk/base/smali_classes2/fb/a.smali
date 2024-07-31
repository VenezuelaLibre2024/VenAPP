.class public abstract Lfb/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lfb/a$c;,
        Lfb/a$b;,
        Lfb/a$e;,
        Lfb/a$a;,
        Lfb/a$d;
    }
.end annotation


# static fields
.field private static final a:Lfb/a;

.field private static final b:Lfb/a;

.field private static final c:Lfb/a;

.field private static final d:Lfb/a;

.field private static final e:Lfb/a;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lfb/a$c;

    const/16 v1, 0x3d

    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v1

    const-string v2, "base64()"

    const-string v3, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/"

    invoke-direct {v0, v2, v3, v1}, Lfb/a$c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Character;)V

    sput-object v0, Lfb/a;->a:Lfb/a;

    new-instance v0, Lfb/a$c;

    const-string v2, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_"

    const-string v3, "base64Url()"

    invoke-direct {v0, v3, v2, v1}, Lfb/a$c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Character;)V

    sput-object v0, Lfb/a;->b:Lfb/a;

    new-instance v0, Lfb/a$e;

    const-string v2, "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567"

    const-string v3, "base32()"

    invoke-direct {v0, v3, v2, v1}, Lfb/a$e;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Character;)V

    sput-object v0, Lfb/a;->c:Lfb/a;

    new-instance v0, Lfb/a$e;

    const-string v2, "0123456789ABCDEFGHIJKLMNOPQRSTUV"

    const-string v3, "base32Hex()"

    invoke-direct {v0, v3, v2, v1}, Lfb/a$e;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Character;)V

    sput-object v0, Lfb/a;->d:Lfb/a;

    new-instance v0, Lfb/a$b;

    const-string v1, "base16()"

    const-string v2, "0123456789ABCDEF"

    invoke-direct {v0, v1, v2}, Lfb/a$b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lfb/a;->e:Lfb/a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lfb/a;
    .locals 1

    sget-object v0, Lfb/a;->e:Lfb/a;

    return-object v0
.end method

.method public static b()Lfb/a;
    .locals 1

    sget-object v0, Lfb/a;->a:Lfb/a;

    return-object v0
.end method

.method private static i([BI)[B
    .locals 2

    array-length v0, p0

    if-ne p1, v0, :cond_0

    return-object p0

    :cond_0
    new-array v0, p1, [B

    const/4 v1, 0x0

    invoke-static {p0, v1, v0, v1, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v0
.end method


# virtual methods
.method public final c(Ljava/lang/CharSequence;)[B
    .locals 1

    :try_start_0
    invoke-virtual {p0, p1}, Lfb/a;->d(Ljava/lang/CharSequence;)[B

    move-result-object p1
    :try_end_0
    .catch Lfb/a$d; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method final d(Ljava/lang/CharSequence;)[B
    .locals 1

    invoke-virtual {p0, p1}, Lfb/a;->m(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    invoke-virtual {p0, v0}, Lfb/a;->j(I)I

    move-result v0

    new-array v0, v0, [B

    invoke-virtual {p0, v0, p1}, Lfb/a;->e([BLjava/lang/CharSequence;)I

    move-result p1

    invoke-static {v0, p1}, Lfb/a;->i([BI)[B

    move-result-object p1

    return-object p1
.end method

.method abstract e([BLjava/lang/CharSequence;)I
.end method

.method public f([B)Ljava/lang/String;
    .locals 2

    array-length v0, p1

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1, v0}, Lfb/a;->g([BII)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final g([BII)Ljava/lang/String;
    .locals 2

    add-int v0, p2, p3

    array-length v1, p1

    invoke-static {p2, v0, v1}, Leb/o;->t(III)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {p0, p3}, Lfb/a;->k(I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    :try_start_0
    invoke-virtual {p0, v0, p1, p2, p3}, Lfb/a;->h(Ljava/lang/Appendable;[BII)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :catch_0
    move-exception p1

    new-instance p2, Ljava/lang/AssertionError;

    invoke-direct {p2, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p2
.end method

.method abstract h(Ljava/lang/Appendable;[BII)V
.end method

.method abstract j(I)I
.end method

.method abstract k(I)I
.end method

.method public abstract l()Lfb/a;
.end method

.method abstract m(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
.end method

.method public abstract n()Lfb/a;
.end method
