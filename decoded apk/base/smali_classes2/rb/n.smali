.class final Lrb/n;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lxb/a;

.field private static final b:Lcom/google/crypto/tink/internal/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/crypto/tink/internal/k<",
            "Lrb/l;",
            "Lcom/google/crypto/tink/internal/p;",
            ">;"
        }
    .end annotation
.end field

.field private static final c:Lcom/google/crypto/tink/internal/j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/crypto/tink/internal/j<",
            "Lcom/google/crypto/tink/internal/p;",
            ">;"
        }
    .end annotation
.end field

.field private static final d:Lcom/google/crypto/tink/internal/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/crypto/tink/internal/c<",
            "Lrb/i;",
            "Lcom/google/crypto/tink/internal/o;",
            ">;"
        }
    .end annotation
.end field

.field private static final e:Lcom/google/crypto/tink/internal/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/crypto/tink/internal/b<",
            "Lcom/google/crypto/tink/internal/o;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const-string v0, "type.googleapis.com/google.crypto.tink.HmacKey"

    invoke-static {v0}, Lcom/google/crypto/tink/internal/t;->e(Ljava/lang/String;)Lxb/a;

    move-result-object v0

    sput-object v0, Lrb/n;->a:Lxb/a;

    new-instance v1, Lkb/j;

    invoke-direct {v1}, Lkb/j;-><init>()V

    const-class v2, Lrb/l;

    const-class v3, Lcom/google/crypto/tink/internal/p;

    invoke-static {v1, v2, v3}, Lcom/google/crypto/tink/internal/k;->a(Lcom/google/crypto/tink/internal/k$b;Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/crypto/tink/internal/k;

    move-result-object v1

    sput-object v1, Lrb/n;->b:Lcom/google/crypto/tink/internal/k;

    new-instance v1, Lkb/k;

    invoke-direct {v1}, Lkb/k;-><init>()V

    invoke-static {v1, v0, v3}, Lcom/google/crypto/tink/internal/j;->a(Lcom/google/crypto/tink/internal/j$b;Lxb/a;Ljava/lang/Class;)Lcom/google/crypto/tink/internal/j;

    move-result-object v1

    sput-object v1, Lrb/n;->c:Lcom/google/crypto/tink/internal/j;

    new-instance v1, Lkb/l;

    invoke-direct {v1}, Lkb/l;-><init>()V

    const-class v2, Lrb/i;

    const-class v3, Lcom/google/crypto/tink/internal/o;

    invoke-static {v1, v2, v3}, Lcom/google/crypto/tink/internal/c;->a(Lcom/google/crypto/tink/internal/c$b;Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/crypto/tink/internal/c;

    move-result-object v1

    sput-object v1, Lrb/n;->d:Lcom/google/crypto/tink/internal/c;

    new-instance v1, Lrb/m;

    invoke-direct {v1}, Lrb/m;-><init>()V

    invoke-static {v1, v0, v3}, Lcom/google/crypto/tink/internal/b;->a(Lcom/google/crypto/tink/internal/b$b;Lxb/a;Ljava/lang/Class;)Lcom/google/crypto/tink/internal/b;

    move-result-object v0

    sput-object v0, Lrb/n;->e:Lcom/google/crypto/tink/internal/b;

    return-void
.end method

.method public static synthetic a(Lcom/google/crypto/tink/internal/o;Ljb/y;)Lrb/i;
    .locals 0

    invoke-static {p0, p1}, Lrb/n;->b(Lcom/google/crypto/tink/internal/o;Ljb/y;)Lrb/i;

    move-result-object p0

    return-object p0
.end method

.method private static b(Lcom/google/crypto/tink/internal/o;Ljb/y;)Lrb/i;
    .locals 3

    invoke-virtual {p0}, Lcom/google/crypto/tink/internal/o;->f()Ljava/lang/String;

    move-result-object v0

    const-string v1, "type.googleapis.com/google.crypto.tink.HmacKey"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :try_start_0
    invoke-virtual {p0}, Lcom/google/crypto/tink/internal/o;->g()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/p;->b()Lcom/google/crypto/tink/shaded/protobuf/p;

    move-result-object v1

    invoke-static {v0, v1}, Lvb/v;->e0(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Lvb/v;

    move-result-object v0

    invoke-virtual {v0}, Lvb/v;->c0()I

    move-result v1

    if-nez v1, :cond_0

    invoke-static {}, Lrb/l;->a()Lrb/l$b;

    move-result-object v1

    invoke-virtual {v0}, Lvb/v;->a0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/h;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Lrb/l$b;->c(I)Lrb/l$b;

    move-result-object v1

    invoke-virtual {v0}, Lvb/v;->b0()Lvb/x;

    move-result-object v2

    invoke-virtual {v2}, Lvb/x;->a0()I

    move-result v2

    invoke-virtual {v1, v2}, Lrb/l$b;->d(I)Lrb/l$b;

    move-result-object v1

    invoke-virtual {v0}, Lvb/v;->b0()Lvb/x;

    move-result-object v2

    invoke-virtual {v2}, Lvb/x;->Z()Lvb/u;

    move-result-object v2

    invoke-static {v2}, Lrb/n;->e(Lvb/u;)Lrb/l$c;

    move-result-object v2

    invoke-virtual {v1, v2}, Lrb/l$b;->b(Lrb/l$c;)Lrb/l$b;

    move-result-object v1

    invoke-virtual {p0}, Lcom/google/crypto/tink/internal/o;->e()Lvb/i0;

    move-result-object v2

    invoke-static {v2}, Lrb/n;->f(Lvb/i0;)Lrb/l$d;

    move-result-object v2

    invoke-virtual {v1, v2}, Lrb/l$b;->e(Lrb/l$d;)Lrb/l$b;

    move-result-object v1

    invoke-virtual {v1}, Lrb/l$b;->a()Lrb/l;

    move-result-object v1

    invoke-static {}, Lrb/i;->c()Lrb/i$b;

    move-result-object v2

    invoke-virtual {v2, v1}, Lrb/i$b;->e(Lrb/l;)Lrb/i$b;

    move-result-object v1

    invoke-virtual {v0}, Lvb/v;->a0()Lcom/google/crypto/tink/shaded/protobuf/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/h;->w()[B

    move-result-object v0

    invoke-static {p1}, Ljb/y;->b(Ljb/y;)Ljb/y;

    move-result-object p1

    invoke-static {v0, p1}, Lxb/b;->a([BLjb/y;)Lxb/b;

    move-result-object p1

    invoke-virtual {v1, p1}, Lrb/i$b;->d(Lxb/b;)Lrb/i$b;

    move-result-object p1

    invoke-virtual {p0}, Lcom/google/crypto/tink/internal/o;->c()Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {p1, p0}, Lrb/i$b;->c(Ljava/lang/Integer;)Lrb/i$b;

    move-result-object p0

    invoke-virtual {p0}, Lrb/i$b;->a()Lrb/i;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "Only version 0 keys are accepted"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/b0; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "Parsing HmacKey failed"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Wrong type URL in call to HmacProtoSerialization.parseKey"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static c()V
    .locals 1

    invoke-static {}, Lcom/google/crypto/tink/internal/i;->a()Lcom/google/crypto/tink/internal/i;

    move-result-object v0

    invoke-static {v0}, Lrb/n;->d(Lcom/google/crypto/tink/internal/i;)V

    return-void
.end method

.method public static d(Lcom/google/crypto/tink/internal/i;)V
    .locals 1

    sget-object v0, Lrb/n;->b:Lcom/google/crypto/tink/internal/k;

    invoke-virtual {p0, v0}, Lcom/google/crypto/tink/internal/i;->h(Lcom/google/crypto/tink/internal/k;)V

    sget-object v0, Lrb/n;->c:Lcom/google/crypto/tink/internal/j;

    invoke-virtual {p0, v0}, Lcom/google/crypto/tink/internal/i;->g(Lcom/google/crypto/tink/internal/j;)V

    sget-object v0, Lrb/n;->d:Lcom/google/crypto/tink/internal/c;

    invoke-virtual {p0, v0}, Lcom/google/crypto/tink/internal/i;->f(Lcom/google/crypto/tink/internal/c;)V

    sget-object v0, Lrb/n;->e:Lcom/google/crypto/tink/internal/b;

    invoke-virtual {p0, v0}, Lcom/google/crypto/tink/internal/i;->e(Lcom/google/crypto/tink/internal/b;)V

    return-void
.end method

.method private static e(Lvb/u;)Lrb/l$c;
    .locals 3

    sget-object v0, Lrb/n$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_4

    const/4 v1, 0x2

    if-eq v0, v1, :cond_3

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    sget-object p0, Lrb/l$c;->f:Lrb/l$c;

    return-object p0

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unable to parse HashType: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lvb/u;->a()I

    move-result p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    sget-object p0, Lrb/l$c;->e:Lrb/l$c;

    return-object p0

    :cond_2
    sget-object p0, Lrb/l$c;->d:Lrb/l$c;

    return-object p0

    :cond_3
    sget-object p0, Lrb/l$c;->c:Lrb/l$c;

    return-object p0

    :cond_4
    sget-object p0, Lrb/l$c;->b:Lrb/l$c;

    return-object p0
.end method

.method private static f(Lvb/i0;)Lrb/l$d;
    .locals 3

    sget-object v0, Lrb/n$a;->b:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    sget-object p0, Lrb/l$d;->e:Lrb/l$d;

    return-object p0

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unable to parse OutputPrefixType: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lvb/i0;->a()I

    move-result p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    sget-object p0, Lrb/l$d;->d:Lrb/l$d;

    return-object p0

    :cond_2
    sget-object p0, Lrb/l$d;->c:Lrb/l$d;

    return-object p0

    :cond_3
    sget-object p0, Lrb/l$d;->b:Lrb/l$d;

    return-object p0
.end method
