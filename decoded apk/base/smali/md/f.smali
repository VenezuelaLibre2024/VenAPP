.class final Lmd/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljd/e;


# static fields
.field private static final f:Ljava/nio/charset/Charset;

.field private static final g:Ljd/c;

.field private static final h:Ljd/c;

.field private static final i:Ljd/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljd/d<",
            "Ljava/util/Map$Entry<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field


# instance fields
.field private a:Ljava/io/OutputStream;

.field private final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Ljd/d<",
            "*>;>;"
        }
    .end annotation
.end field

.field private final c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Ljd/f<",
            "*>;>;"
        }
    .end annotation
.end field

.field private final d:Ljd/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljd/d<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Lmd/i;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-string v0, "UTF-8"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, Lmd/f;->f:Ljava/nio/charset/Charset;

    const-string v0, "key"

    invoke-static {v0}, Ljd/c;->a(Ljava/lang/String;)Ljd/c$b;

    move-result-object v0

    invoke-static {}, Lmd/a;->b()Lmd/a;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lmd/a;->c(I)Lmd/a;

    move-result-object v1

    invoke-virtual {v1}, Lmd/a;->a()Lmd/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljd/c$b;->b(Ljava/lang/annotation/Annotation;)Ljd/c$b;

    move-result-object v0

    invoke-virtual {v0}, Ljd/c$b;->a()Ljd/c;

    move-result-object v0

    sput-object v0, Lmd/f;->g:Ljd/c;

    const-string v0, "value"

    invoke-static {v0}, Ljd/c;->a(Ljava/lang/String;)Ljd/c$b;

    move-result-object v0

    invoke-static {}, Lmd/a;->b()Lmd/a;

    move-result-object v1

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Lmd/a;->c(I)Lmd/a;

    move-result-object v1

    invoke-virtual {v1}, Lmd/a;->a()Lmd/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljd/c$b;->b(Ljava/lang/annotation/Annotation;)Ljd/c$b;

    move-result-object v0

    invoke-virtual {v0}, Ljd/c$b;->a()Ljd/c;

    move-result-object v0

    sput-object v0, Lmd/f;->h:Ljd/c;

    new-instance v0, Lmd/e;

    invoke-direct {v0}, Lmd/e;-><init>()V

    sput-object v0, Lmd/f;->i:Ljd/d;

    return-void
.end method

.method constructor <init>(Ljava/io/OutputStream;Ljava/util/Map;Ljava/util/Map;Ljd/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/OutputStream;",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Ljd/d<",
            "*>;>;",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Ljd/f<",
            "*>;>;",
            "Ljd/d<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lmd/i;

    invoke-direct {v0, p0}, Lmd/i;-><init>(Lmd/f;)V

    iput-object v0, p0, Lmd/f;->e:Lmd/i;

    iput-object p1, p0, Lmd/f;->a:Ljava/io/OutputStream;

    iput-object p2, p0, Lmd/f;->b:Ljava/util/Map;

    iput-object p3, p0, Lmd/f;->c:Ljava/util/Map;

    iput-object p4, p0, Lmd/f;->d:Ljd/d;

    return-void
.end method

.method public static synthetic a(Ljava/util/Map$Entry;Ljd/e;)V
    .locals 0

    invoke-static {p0, p1}, Lmd/f;->r(Ljava/util/Map$Entry;Ljd/e;)V

    return-void
.end method

.method private static k(I)Ljava/nio/ByteBuffer;
    .locals 1

    invoke-static {p0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object p0

    sget-object v0, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object p0

    return-object p0
.end method

.method private l(Ljd/d;Ljava/lang/Object;)J
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljd/d<",
            "TT;>;TT;)J"
        }
    .end annotation

    new-instance v0, Lmd/b;

    invoke-direct {v0}, Lmd/b;-><init>()V

    :try_start_0
    iget-object v1, p0, Lmd/f;->a:Ljava/io/OutputStream;

    iput-object v0, p0, Lmd/f;->a:Ljava/io/OutputStream;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-interface {p1, p2, p0}, Ljd/d;->encode(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    iput-object v1, p0, Lmd/f;->a:Ljava/io/OutputStream;

    invoke-virtual {v0}, Lmd/b;->a()J

    move-result-wide p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    return-wide p1

    :catchall_0
    move-exception p1

    :try_start_3
    iput-object v1, p0, Lmd/f;->a:Ljava/io/OutputStream;

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception p1

    :try_start_4
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    goto :goto_0

    :catchall_2
    move-exception p2

    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1
.end method

.method private m(Ljd/d;Ljd/c;Ljava/lang/Object;Z)Lmd/f;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljd/d<",
            "TT;>;",
            "Ljd/c;",
            "TT;Z)",
            "Lmd/f;"
        }
    .end annotation

    invoke-direct {p0, p1, p3}, Lmd/f;->l(Ljd/d;Ljava/lang/Object;)J

    move-result-wide v0

    if-eqz p4, :cond_0

    const-wide/16 v2, 0x0

    cmp-long p4, v0, v2

    if-nez p4, :cond_0

    return-object p0

    :cond_0
    invoke-static {p2}, Lmd/f;->q(Ljd/c;)I

    move-result p2

    shl-int/lit8 p2, p2, 0x3

    or-int/lit8 p2, p2, 0x2

    invoke-direct {p0, p2}, Lmd/f;->s(I)V

    invoke-direct {p0, v0, v1}, Lmd/f;->t(J)V

    invoke-interface {p1, p3, p0}, Ljd/d;->encode(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p0
.end method

.method private n(Ljd/f;Ljd/c;Ljava/lang/Object;Z)Lmd/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljd/f<",
            "TT;>;",
            "Ljd/c;",
            "TT;Z)",
            "Lmd/f;"
        }
    .end annotation

    iget-object v0, p0, Lmd/f;->e:Lmd/i;

    invoke-virtual {v0, p2, p4}, Lmd/i;->b(Ljd/c;Z)V

    iget-object p2, p0, Lmd/f;->e:Lmd/i;

    invoke-interface {p1, p3, p2}, Ljd/f;->encode(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p0
.end method

.method private static p(Ljd/c;)Lmd/d;
    .locals 1

    const-class v0, Lmd/d;

    invoke-virtual {p0, v0}, Ljd/c;->c(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object p0

    check-cast p0, Lmd/d;

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    new-instance p0, Ljd/b;

    const-string v0, "Field has no @Protobuf config"

    invoke-direct {p0, v0}, Ljd/b;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static q(Ljd/c;)I
    .locals 1

    const-class v0, Lmd/d;

    invoke-virtual {p0, v0}, Ljd/c;->c(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object p0

    check-cast p0, Lmd/d;

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lmd/d;->tag()I

    move-result p0

    return p0

    :cond_0
    new-instance p0, Ljd/b;

    const-string v0, "Field has no @Protobuf config"

    invoke-direct {p0, v0}, Ljd/b;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static synthetic r(Ljava/util/Map$Entry;Ljd/e;)V
    .locals 2

    sget-object v0, Lmd/f;->g:Ljd/c;

    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    sget-object v0, Lmd/f;->h:Ljd/c;

    invoke-interface {p0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p0

    invoke-interface {p1, v0, p0}, Ljd/e;->add(Ljd/c;Ljava/lang/Object;)Ljd/e;

    return-void
.end method

.method private s(I)V
    .locals 4

    :goto_0
    and-int/lit8 v0, p1, -0x80

    int-to-long v0, v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    iget-object v0, p0, Lmd/f;->a:Ljava/io/OutputStream;

    and-int/lit8 v1, p1, 0x7f

    or-int/lit16 v1, v1, 0x80

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write(I)V

    ushr-int/lit8 p1, p1, 0x7

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lmd/f;->a:Ljava/io/OutputStream;

    and-int/lit8 p1, p1, 0x7f

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write(I)V

    return-void
.end method

.method private t(J)V
    .locals 4

    :goto_0
    const-wide/16 v0, -0x80

    and-long/2addr v0, p1

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    iget-object v0, p0, Lmd/f;->a:Ljava/io/OutputStream;

    long-to-int v1, p1

    and-int/lit8 v1, v1, 0x7f

    or-int/lit16 v1, v1, 0x80

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write(I)V

    const/4 v0, 0x7

    ushr-long/2addr p1, v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lmd/f;->a:Ljava/io/OutputStream;

    long-to-int p1, p1

    and-int/lit8 p1, p1, 0x7f

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write(I)V

    return-void
.end method


# virtual methods
.method public add(Ljd/c;D)Ljd/e;
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, p2, p3, v0}, Lmd/f;->b(Ljd/c;DZ)Ljd/e;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic add(Ljd/c;I)Ljd/e;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lmd/f;->e(Ljd/c;I)Lmd/f;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic add(Ljd/c;J)Ljd/e;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lmd/f;->g(Ljd/c;J)Lmd/f;

    move-result-object p1

    return-object p1
.end method

.method public add(Ljd/c;Ljava/lang/Object;)Ljd/e;
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, p2, v0}, Lmd/f;->d(Ljd/c;Ljava/lang/Object;Z)Ljd/e;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic add(Ljd/c;Z)Ljd/e;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lmd/f;->i(Ljd/c;Z)Lmd/f;

    move-result-object p1

    return-object p1
.end method

.method b(Ljd/c;DZ)Ljd/e;
    .locals 2

    if-eqz p4, :cond_0

    const-wide/16 v0, 0x0

    cmpl-double p4, p2, v0

    if-nez p4, :cond_0

    return-object p0

    :cond_0
    invoke-static {p1}, Lmd/f;->q(Ljd/c;)I

    move-result p1

    shl-int/lit8 p1, p1, 0x3

    or-int/lit8 p1, p1, 0x1

    invoke-direct {p0, p1}, Lmd/f;->s(I)V

    iget-object p1, p0, Lmd/f;->a:Ljava/io/OutputStream;

    const/16 p4, 0x8

    invoke-static {p4}, Lmd/f;->k(I)Ljava/nio/ByteBuffer;

    move-result-object p4

    invoke-virtual {p4, p2, p3}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    move-result-object p2

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/io/OutputStream;->write([B)V

    return-object p0
.end method

.method c(Ljd/c;FZ)Ljd/e;
    .locals 0

    if-eqz p3, :cond_0

    const/4 p3, 0x0

    cmpl-float p3, p2, p3

    if-nez p3, :cond_0

    return-object p0

    :cond_0
    invoke-static {p1}, Lmd/f;->q(Ljd/c;)I

    move-result p1

    shl-int/lit8 p1, p1, 0x3

    or-int/lit8 p1, p1, 0x5

    invoke-direct {p0, p1}, Lmd/f;->s(I)V

    iget-object p1, p0, Lmd/f;->a:Ljava/io/OutputStream;

    const/4 p3, 0x4

    invoke-static {p3}, Lmd/f;->k(I)Ljava/nio/ByteBuffer;

    move-result-object p3

    invoke-virtual {p3, p2}, Ljava/nio/ByteBuffer;->putFloat(F)Ljava/nio/ByteBuffer;

    move-result-object p2

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/io/OutputStream;->write([B)V

    return-object p0
.end method

.method d(Ljd/c;Ljava/lang/Object;Z)Ljd/e;
    .locals 2

    if-nez p2, :cond_0

    return-object p0

    :cond_0
    instance-of v0, p2, Ljava/lang/CharSequence;

    if-eqz v0, :cond_2

    check-cast p2, Ljava/lang/CharSequence;

    if-eqz p3, :cond_1

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result p3

    if-nez p3, :cond_1

    return-object p0

    :cond_1
    invoke-static {p1}, Lmd/f;->q(Ljd/c;)I

    move-result p1

    shl-int/lit8 p1, p1, 0x3

    or-int/lit8 p1, p1, 0x2

    invoke-direct {p0, p1}, Lmd/f;->s(I)V

    invoke-interface {p2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    sget-object p2, Lmd/f;->f:Ljava/nio/charset/Charset;

    invoke-virtual {p1, p2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    array-length p2, p1

    invoke-direct {p0, p2}, Lmd/f;->s(I)V

    iget-object p2, p0, Lmd/f;->a:Ljava/io/OutputStream;

    invoke-virtual {p2, p1}, Ljava/io/OutputStream;->write([B)V

    return-object p0

    :cond_2
    instance-of v0, p2, Ljava/util/Collection;

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    check-cast p2, Ljava/util/Collection;

    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    invoke-virtual {p0, p1, p3, v1}, Lmd/f;->d(Ljd/c;Ljava/lang/Object;Z)Ljd/e;

    goto :goto_0

    :cond_3
    return-object p0

    :cond_4
    instance-of v0, p2, Ljava/util/Map;

    if-eqz v0, :cond_6

    check-cast p2, Ljava/util/Map;

    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_5

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/Map$Entry;

    sget-object v0, Lmd/f;->i:Ljd/d;

    invoke-direct {p0, v0, p1, p3, v1}, Lmd/f;->m(Ljd/d;Ljd/c;Ljava/lang/Object;Z)Lmd/f;

    goto :goto_1

    :cond_5
    return-object p0

    :cond_6
    instance-of v0, p2, Ljava/lang/Double;

    if-eqz v0, :cond_7

    check-cast p2, Ljava/lang/Double;

    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    invoke-virtual {p0, p1, v0, v1, p3}, Lmd/f;->b(Ljd/c;DZ)Ljd/e;

    move-result-object p1

    return-object p1

    :cond_7
    instance-of v0, p2, Ljava/lang/Float;

    if-eqz v0, :cond_8

    check-cast p2, Ljava/lang/Float;

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result p2

    invoke-virtual {p0, p1, p2, p3}, Lmd/f;->c(Ljd/c;FZ)Ljd/e;

    move-result-object p1

    return-object p1

    :cond_8
    instance-of v0, p2, Ljava/lang/Number;

    if-eqz v0, :cond_9

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-virtual {p0, p1, v0, v1, p3}, Lmd/f;->h(Ljd/c;JZ)Lmd/f;

    move-result-object p1

    return-object p1

    :cond_9
    instance-of v0, p2, Ljava/lang/Boolean;

    if-eqz v0, :cond_a

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-virtual {p0, p1, p2, p3}, Lmd/f;->j(Ljd/c;ZZ)Lmd/f;

    move-result-object p1

    return-object p1

    :cond_a
    instance-of v0, p2, [B

    if-eqz v0, :cond_c

    check-cast p2, [B

    if-eqz p3, :cond_b

    array-length p3, p2

    if-nez p3, :cond_b

    return-object p0

    :cond_b
    invoke-static {p1}, Lmd/f;->q(Ljd/c;)I

    move-result p1

    shl-int/lit8 p1, p1, 0x3

    or-int/lit8 p1, p1, 0x2

    invoke-direct {p0, p1}, Lmd/f;->s(I)V

    array-length p1, p2

    invoke-direct {p0, p1}, Lmd/f;->s(I)V

    iget-object p1, p0, Lmd/f;->a:Ljava/io/OutputStream;

    invoke-virtual {p1, p2}, Ljava/io/OutputStream;->write([B)V

    return-object p0

    :cond_c
    iget-object v0, p0, Lmd/f;->b:Ljava/util/Map;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljd/d;

    if-eqz v0, :cond_d

    invoke-direct {p0, v0, p1, p2, p3}, Lmd/f;->m(Ljd/d;Ljd/c;Ljava/lang/Object;Z)Lmd/f;

    move-result-object p1

    return-object p1

    :cond_d
    iget-object v0, p0, Lmd/f;->c:Ljava/util/Map;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljd/f;

    if-eqz v0, :cond_e

    invoke-direct {p0, v0, p1, p2, p3}, Lmd/f;->n(Ljd/f;Ljd/c;Ljava/lang/Object;Z)Lmd/f;

    move-result-object p1

    return-object p1

    :cond_e
    instance-of v0, p2, Lmd/c;

    if-eqz v0, :cond_f

    check-cast p2, Lmd/c;

    invoke-interface {p2}, Lmd/c;->a()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lmd/f;->e(Ljd/c;I)Lmd/f;

    move-result-object p1

    return-object p1

    :cond_f
    instance-of v0, p2, Ljava/lang/Enum;

    if-eqz v0, :cond_10

    check-cast p2, Ljava/lang/Enum;

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lmd/f;->e(Ljd/c;I)Lmd/f;

    move-result-object p1

    return-object p1

    :cond_10
    iget-object v0, p0, Lmd/f;->d:Ljd/d;

    invoke-direct {p0, v0, p1, p2, p3}, Lmd/f;->m(Ljd/d;Ljd/c;Ljava/lang/Object;Z)Lmd/f;

    move-result-object p1

    return-object p1
.end method

.method public e(Ljd/c;I)Lmd/f;
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, p2, v0}, Lmd/f;->f(Ljd/c;IZ)Lmd/f;

    move-result-object p1

    return-object p1
.end method

.method f(Ljd/c;IZ)Lmd/f;
    .locals 2

    if-eqz p3, :cond_0

    if-nez p2, :cond_0

    return-object p0

    :cond_0
    invoke-static {p1}, Lmd/f;->p(Ljd/c;)Lmd/d;

    move-result-object p1

    sget-object p3, Lmd/f$a;->a:[I

    invoke-interface {p1}, Lmd/d;->intEncoding()Lmd/d$a;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget p3, p3, v0

    const/4 v0, 0x1

    const/4 v1, 0x3

    if-eq p3, v0, :cond_3

    const/4 v0, 0x2

    if-eq p3, v0, :cond_2

    if-eq p3, v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-interface {p1}, Lmd/d;->tag()I

    move-result p1

    shl-int/2addr p1, v1

    or-int/lit8 p1, p1, 0x5

    invoke-direct {p0, p1}, Lmd/f;->s(I)V

    iget-object p1, p0, Lmd/f;->a:Ljava/io/OutputStream;

    const/4 p3, 0x4

    invoke-static {p3}, Lmd/f;->k(I)Ljava/nio/ByteBuffer;

    move-result-object p3

    invoke-virtual {p3, p2}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object p2

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/io/OutputStream;->write([B)V

    goto :goto_0

    :cond_2
    invoke-interface {p1}, Lmd/d;->tag()I

    move-result p1

    shl-int/2addr p1, v1

    invoke-direct {p0, p1}, Lmd/f;->s(I)V

    shl-int/lit8 p1, p2, 0x1

    shr-int/lit8 p2, p2, 0x1f

    xor-int/2addr p1, p2

    invoke-direct {p0, p1}, Lmd/f;->s(I)V

    goto :goto_0

    :cond_3
    invoke-interface {p1}, Lmd/d;->tag()I

    move-result p1

    shl-int/2addr p1, v1

    invoke-direct {p0, p1}, Lmd/f;->s(I)V

    invoke-direct {p0, p2}, Lmd/f;->s(I)V

    :goto_0
    return-object p0
.end method

.method public g(Ljd/c;J)Lmd/f;
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, p2, p3, v0}, Lmd/f;->h(Ljd/c;JZ)Lmd/f;

    move-result-object p1

    return-object p1
.end method

.method h(Ljd/c;JZ)Lmd/f;
    .locals 3

    if-eqz p4, :cond_0

    const-wide/16 v0, 0x0

    cmp-long p4, p2, v0

    if-nez p4, :cond_0

    return-object p0

    :cond_0
    invoke-static {p1}, Lmd/f;->p(Ljd/c;)Lmd/d;

    move-result-object p1

    sget-object p4, Lmd/f$a;->a:[I

    invoke-interface {p1}, Lmd/d;->intEncoding()Lmd/d$a;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget p4, p4, v0

    const/4 v0, 0x1

    const/4 v1, 0x3

    if-eq p4, v0, :cond_3

    const/4 v2, 0x2

    if-eq p4, v2, :cond_2

    if-eq p4, v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-interface {p1}, Lmd/d;->tag()I

    move-result p1

    shl-int/2addr p1, v1

    or-int/2addr p1, v0

    invoke-direct {p0, p1}, Lmd/f;->s(I)V

    iget-object p1, p0, Lmd/f;->a:Ljava/io/OutputStream;

    const/16 p4, 0x8

    invoke-static {p4}, Lmd/f;->k(I)Ljava/nio/ByteBuffer;

    move-result-object p4

    invoke-virtual {p4, p2, p3}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    move-result-object p2

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/io/OutputStream;->write([B)V

    goto :goto_0

    :cond_2
    invoke-interface {p1}, Lmd/d;->tag()I

    move-result p1

    shl-int/2addr p1, v1

    invoke-direct {p0, p1}, Lmd/f;->s(I)V

    shl-long v0, p2, v0

    const/16 p1, 0x3f

    shr-long p1, p2, p1

    xor-long/2addr p1, v0

    invoke-direct {p0, p1, p2}, Lmd/f;->t(J)V

    goto :goto_0

    :cond_3
    invoke-interface {p1}, Lmd/d;->tag()I

    move-result p1

    shl-int/2addr p1, v1

    invoke-direct {p0, p1}, Lmd/f;->s(I)V

    invoke-direct {p0, p2, p3}, Lmd/f;->t(J)V

    :goto_0
    return-object p0
.end method

.method public i(Ljd/c;Z)Lmd/f;
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, p2, v0}, Lmd/f;->j(Ljd/c;ZZ)Lmd/f;

    move-result-object p1

    return-object p1
.end method

.method j(Ljd/c;ZZ)Lmd/f;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lmd/f;->f(Ljd/c;IZ)Lmd/f;

    move-result-object p1

    return-object p1
.end method

.method o(Ljava/lang/Object;)Lmd/f;
    .locals 3

    if-nez p1, :cond_0

    return-object p0

    :cond_0
    iget-object v0, p0, Lmd/f;->b:Ljava/util/Map;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljd/d;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1, p0}, Ljd/d;->encode(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p0

    :cond_1
    new-instance v0, Ljd/b;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "No encoder for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljd/b;-><init>(Ljava/lang/String;)V

    throw v0
.end method
