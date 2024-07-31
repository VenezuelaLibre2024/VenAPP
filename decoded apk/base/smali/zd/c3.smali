.class public final Lzd/c3;
.super Lcom/google/protobuf/x;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/s0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzd/c3$a;,
        Lzd/c3$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/x<",
        "Lzd/c3;",
        "Lzd/c3$a;",
        ">;",
        "Lcom/google/protobuf/s0;"
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:Lzd/c3;

.field public static final LIMITS_FIELD_NUMBER:I = 0x1

.field private static volatile PARSER:Lcom/google/protobuf/z0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/z0<",
            "Lzd/c3;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private limits_:Lcom/google/protobuf/l0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/l0<",
            "Ljava/lang/String;",
            "Lzd/b3;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lzd/c3;

    invoke-direct {v0}, Lzd/c3;-><init>()V

    sput-object v0, Lzd/c3;->DEFAULT_INSTANCE:Lzd/c3;

    const-class v1, Lzd/c3;

    invoke-static {v1, v0}, Lcom/google/protobuf/x;->W(Ljava/lang/Class;Lcom/google/protobuf/x;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/protobuf/x;-><init>()V

    invoke-static {}, Lcom/google/protobuf/l0;->d()Lcom/google/protobuf/l0;

    move-result-object v0

    iput-object v0, p0, Lzd/c3;->limits_:Lcom/google/protobuf/l0;

    return-void
.end method

.method static synthetic Z()Lzd/c3;
    .locals 1

    sget-object v0, Lzd/c3;->DEFAULT_INSTANCE:Lzd/c3;

    return-object v0
.end method

.method static synthetic b0(Lzd/c3;)Ljava/util/Map;
    .locals 0

    invoke-direct {p0}, Lzd/c3;->f0()Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static d0()Lzd/c3;
    .locals 1

    sget-object v0, Lzd/c3;->DEFAULT_INSTANCE:Lzd/c3;

    return-object v0
.end method

.method private f0()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lzd/b3;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lzd/c3;->h0()Lcom/google/protobuf/l0;

    move-result-object v0

    return-object v0
.end method

.method private g0()Lcom/google/protobuf/l0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/l0<",
            "Ljava/lang/String;",
            "Lzd/b3;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lzd/c3;->limits_:Lcom/google/protobuf/l0;

    return-object v0
.end method

.method private h0()Lcom/google/protobuf/l0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/l0<",
            "Ljava/lang/String;",
            "Lzd/b3;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lzd/c3;->limits_:Lcom/google/protobuf/l0;

    invoke-virtual {v0}, Lcom/google/protobuf/l0;->j()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lzd/c3;->limits_:Lcom/google/protobuf/l0;

    invoke-virtual {v0}, Lcom/google/protobuf/l0;->m()Lcom/google/protobuf/l0;

    move-result-object v0

    iput-object v0, p0, Lzd/c3;->limits_:Lcom/google/protobuf/l0;

    :cond_0
    iget-object v0, p0, Lzd/c3;->limits_:Lcom/google/protobuf/l0;

    return-object v0
.end method

.method public static i0(Lzd/c3;)Lzd/c3$a;
    .locals 1

    sget-object v0, Lzd/c3;->DEFAULT_INSTANCE:Lzd/c3;

    invoke-virtual {v0, p0}, Lcom/google/protobuf/x;->B(Lcom/google/protobuf/x;)Lcom/google/protobuf/x$a;

    move-result-object p0

    check-cast p0, Lzd/c3$a;

    return-object p0
.end method

.method public static j0()Lcom/google/protobuf/z0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/z0<",
            "Lzd/c3;",
            ">;"
        }
    .end annotation

    sget-object v0, Lzd/c3;->DEFAULT_INSTANCE:Lzd/c3;

    invoke-virtual {v0}, Lcom/google/protobuf/x;->g()Lcom/google/protobuf/z0;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method protected final E(Lcom/google/protobuf/x$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object p2, Lzd/a3;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, p2, p1

    const/4 p2, 0x1

    const/4 p3, 0x0

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :pswitch_0
    return-object p3

    :pswitch_1
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1

    :pswitch_2
    sget-object p1, Lzd/c3;->PARSER:Lcom/google/protobuf/z0;

    if-nez p1, :cond_1

    const-class p2, Lzd/c3;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lzd/c3;->PARSER:Lcom/google/protobuf/z0;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/protobuf/x$b;

    sget-object p3, Lzd/c3;->DEFAULT_INSTANCE:Lzd/c3;

    invoke-direct {p1, p3}, Lcom/google/protobuf/x$b;-><init>(Lcom/google/protobuf/x;)V

    sput-object p1, Lzd/c3;->PARSER:Lcom/google/protobuf/z0;

    :cond_0
    monitor-exit p2

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_1
    :goto_0
    return-object p1

    :pswitch_3
    sget-object p1, Lzd/c3;->DEFAULT_INSTANCE:Lzd/c3;

    return-object p1

    :pswitch_4
    const/4 p1, 0x2

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "limits_"

    aput-object v0, p1, p3

    sget-object p3, Lzd/c3$b;->a:Lcom/google/protobuf/k0;

    aput-object p3, p1, p2

    const-string p2, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012"

    sget-object p3, Lzd/c3;->DEFAULT_INSTANCE:Lzd/c3;

    invoke-static {p3, p2, p1}, Lcom/google/protobuf/x;->T(Lcom/google/protobuf/r0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lzd/c3$a;

    invoke-direct {p1, p3}, Lzd/c3$a;-><init>(Lzd/a3;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lzd/c3;

    invoke-direct {p1}, Lzd/c3;-><init>()V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public e0(Ljava/lang/String;Lzd/b3;)Lzd/b3;
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {p0}, Lzd/c3;->g0()Lcom/google/protobuf/l0;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object p2, p1

    check-cast p2, Lzd/b3;

    :cond_0
    return-object p2
.end method
