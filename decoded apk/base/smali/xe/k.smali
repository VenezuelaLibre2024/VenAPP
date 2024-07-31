.class public final Lxe/k;
.super Lcom/google/protobuf/x;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/s0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxe/k$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/x<",
        "Lxe/k;",
        "Lxe/k$c;",
        ">;",
        "Lcom/google/protobuf/s0;"
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:Lxe/k;

.field private static volatile PARSER:Lcom/google/protobuf/z0; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/z0<",
            "Lxe/k;",
            ">;"
        }
    .end annotation
.end field

.field public static final SESSION_ID_FIELD_NUMBER:I = 0x1

.field public static final SESSION_VERBOSITY_FIELD_NUMBER:I = 0x2

.field private static final sessionVerbosity_converter_:Lcom/google/protobuf/a0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/a0<",
            "Ljava/lang/Integer;",
            "Lxe/l;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private bitField0_:I

.field private sessionId_:Ljava/lang/String;

.field private sessionVerbosity_:Lcom/google/protobuf/z$g;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lxe/k$a;

    invoke-direct {v0}, Lxe/k$a;-><init>()V

    sput-object v0, Lxe/k;->sessionVerbosity_converter_:Lcom/google/protobuf/a0;

    new-instance v0, Lxe/k;

    invoke-direct {v0}, Lxe/k;-><init>()V

    sput-object v0, Lxe/k;->DEFAULT_INSTANCE:Lxe/k;

    const-class v1, Lxe/k;

    invoke-static {v1, v0}, Lcom/google/protobuf/x;->W(Ljava/lang/Class;Lcom/google/protobuf/x;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/protobuf/x;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lxe/k;->sessionId_:Ljava/lang/String;

    invoke-static {}, Lcom/google/protobuf/x;->F()Lcom/google/protobuf/z$g;

    move-result-object v0

    iput-object v0, p0, Lxe/k;->sessionVerbosity_:Lcom/google/protobuf/z$g;

    return-void
.end method

.method static synthetic Z()Lxe/k;
    .locals 1

    sget-object v0, Lxe/k;->DEFAULT_INSTANCE:Lxe/k;

    return-object v0
.end method

.method static synthetic b0(Lxe/k;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lxe/k;->j0(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic d0(Lxe/k;Lxe/l;)V
    .locals 0

    invoke-direct {p0, p1}, Lxe/k;->e0(Lxe/l;)V

    return-void
.end method

.method private e0(Lxe/l;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {p0}, Lxe/k;->f0()V

    iget-object v0, p0, Lxe/k;->sessionVerbosity_:Lcom/google/protobuf/z$g;

    invoke-virtual {p1}, Lxe/l;->a()I

    move-result p1

    invoke-interface {v0, p1}, Lcom/google/protobuf/z$g;->F0(I)V

    return-void
.end method

.method private f0()V
    .locals 2

    iget-object v0, p0, Lxe/k;->sessionVerbosity_:Lcom/google/protobuf/z$g;

    invoke-interface {v0}, Lcom/google/protobuf/z$i;->g()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/google/protobuf/x;->Q(Lcom/google/protobuf/z$g;)Lcom/google/protobuf/z$g;

    move-result-object v0

    iput-object v0, p0, Lxe/k;->sessionVerbosity_:Lcom/google/protobuf/z$g;

    :cond_0
    return-void
.end method

.method public static i0()Lxe/k$c;
    .locals 1

    sget-object v0, Lxe/k;->DEFAULT_INSTANCE:Lxe/k;

    invoke-virtual {v0}, Lcom/google/protobuf/x;->A()Lcom/google/protobuf/x$a;

    move-result-object v0

    check-cast v0, Lxe/k$c;

    return-object v0
.end method

.method private j0(Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Lxe/k;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lxe/k;->bitField0_:I

    iput-object p1, p0, Lxe/k;->sessionId_:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method protected final E(Lcom/google/protobuf/x$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object p2, Lxe/k$b;->a:[I

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
    sget-object p1, Lxe/k;->PARSER:Lcom/google/protobuf/z0;

    if-nez p1, :cond_1

    const-class p2, Lxe/k;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lxe/k;->PARSER:Lcom/google/protobuf/z0;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/protobuf/x$b;

    sget-object p3, Lxe/k;->DEFAULT_INSTANCE:Lxe/k;

    invoke-direct {p1, p3}, Lcom/google/protobuf/x$b;-><init>(Lcom/google/protobuf/x;)V

    sput-object p1, Lxe/k;->PARSER:Lcom/google/protobuf/z0;

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
    sget-object p1, Lxe/k;->DEFAULT_INSTANCE:Lxe/k;

    return-object p1

    :pswitch_4
    const/4 p1, 0x4

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "bitField0_"

    aput-object v0, p1, p3

    const-string p3, "sessionId_"

    aput-object p3, p1, p2

    const/4 p2, 0x2

    const-string p3, "sessionVerbosity_"

    aput-object p3, p1, p2

    const/4 p2, 0x3

    invoke-static {}, Lxe/l;->h()Lcom/google/protobuf/z$e;

    move-result-object p3

    aput-object p3, p1, p2

    const-string p2, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u001e"

    sget-object p3, Lxe/k;->DEFAULT_INSTANCE:Lxe/k;

    invoke-static {p3, p2, p1}, Lcom/google/protobuf/x;->T(Lcom/google/protobuf/r0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lxe/k$c;

    invoke-direct {p1, p3}, Lxe/k$c;-><init>(Lxe/k$a;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lxe/k;

    invoke-direct {p1}, Lxe/k;-><init>()V

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

.method public g0(I)Lxe/l;
    .locals 1

    iget-object v0, p0, Lxe/k;->sessionVerbosity_:Lcom/google/protobuf/z$g;

    invoke-interface {v0, p1}, Lcom/google/protobuf/z$g;->getInt(I)I

    move-result p1

    invoke-static {p1}, Lxe/l;->b(I)Lxe/l;

    move-result-object p1

    if-nez p1, :cond_0

    sget-object p1, Lxe/l;->SESSION_VERBOSITY_NONE:Lxe/l;

    :cond_0
    return-object p1
.end method

.method public h0()I
    .locals 1

    iget-object v0, p0, Lxe/k;->sessionVerbosity_:Lcom/google/protobuf/z$g;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method
