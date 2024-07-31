.class public final Lzd/b3;
.super Lcom/google/protobuf/x;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/s0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzd/b3$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/x<",
        "Lzd/b3;",
        "Lzd/b3$a;",
        ">;",
        "Lcom/google/protobuf/s0;"
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:Lzd/b3;

.field private static volatile PARSER:Lcom/google/protobuf/z0; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/z0<",
            "Lzd/b3;",
            ">;"
        }
    .end annotation
.end field

.field public static final START_TIME_EPOCH_FIELD_NUMBER:I = 0x2

.field public static final VALUE_FIELD_NUMBER:I = 0x1


# instance fields
.field private startTimeEpoch_:J

.field private value_:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lzd/b3;

    invoke-direct {v0}, Lzd/b3;-><init>()V

    sput-object v0, Lzd/b3;->DEFAULT_INSTANCE:Lzd/b3;

    const-class v1, Lzd/b3;

    invoke-static {v1, v0}, Lcom/google/protobuf/x;->W(Ljava/lang/Class;Lcom/google/protobuf/x;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/protobuf/x;-><init>()V

    return-void
.end method

.method static synthetic Z()Lzd/b3;
    .locals 1

    sget-object v0, Lzd/b3;->DEFAULT_INSTANCE:Lzd/b3;

    return-object v0
.end method

.method static synthetic b0(Lzd/b3;J)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lzd/b3;->m0(J)V

    return-void
.end method

.method static synthetic d0(Lzd/b3;)V
    .locals 0

    invoke-direct {p0}, Lzd/b3;->f0()V

    return-void
.end method

.method static synthetic e0(Lzd/b3;J)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lzd/b3;->l0(J)V

    return-void
.end method

.method private f0()V
    .locals 2

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lzd/b3;->value_:J

    return-void
.end method

.method public static g0()Lzd/b3;
    .locals 1

    sget-object v0, Lzd/b3;->DEFAULT_INSTANCE:Lzd/b3;

    return-object v0
.end method

.method public static j0()Lzd/b3$a;
    .locals 1

    sget-object v0, Lzd/b3;->DEFAULT_INSTANCE:Lzd/b3;

    invoke-virtual {v0}, Lcom/google/protobuf/x;->A()Lcom/google/protobuf/x$a;

    move-result-object v0

    check-cast v0, Lzd/b3$a;

    return-object v0
.end method

.method public static k0(Lzd/b3;)Lzd/b3$a;
    .locals 1

    sget-object v0, Lzd/b3;->DEFAULT_INSTANCE:Lzd/b3;

    invoke-virtual {v0, p0}, Lcom/google/protobuf/x;->B(Lcom/google/protobuf/x;)Lcom/google/protobuf/x$a;

    move-result-object p0

    check-cast p0, Lzd/b3$a;

    return-object p0
.end method

.method private l0(J)V
    .locals 0

    iput-wide p1, p0, Lzd/b3;->startTimeEpoch_:J

    return-void
.end method

.method private m0(J)V
    .locals 0

    iput-wide p1, p0, Lzd/b3;->value_:J

    return-void
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
    sget-object p1, Lzd/b3;->PARSER:Lcom/google/protobuf/z0;

    if-nez p1, :cond_1

    const-class p2, Lzd/b3;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lzd/b3;->PARSER:Lcom/google/protobuf/z0;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/protobuf/x$b;

    sget-object p3, Lzd/b3;->DEFAULT_INSTANCE:Lzd/b3;

    invoke-direct {p1, p3}, Lcom/google/protobuf/x$b;-><init>(Lcom/google/protobuf/x;)V

    sput-object p1, Lzd/b3;->PARSER:Lcom/google/protobuf/z0;

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
    sget-object p1, Lzd/b3;->DEFAULT_INSTANCE:Lzd/b3;

    return-object p1

    :pswitch_4
    const/4 p1, 0x2

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "value_"

    aput-object v0, p1, p3

    const-string p3, "startTimeEpoch_"

    aput-object p3, p1, p2

    const-string p2, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0002"

    sget-object p3, Lzd/b3;->DEFAULT_INSTANCE:Lzd/b3;

    invoke-static {p3, p2, p1}, Lcom/google/protobuf/x;->T(Lcom/google/protobuf/r0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lzd/b3$a;

    invoke-direct {p1, p3}, Lzd/b3$a;-><init>(Lzd/a3;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lzd/b3;

    invoke-direct {p1}, Lzd/b3;-><init>()V

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

.method public h0()J
    .locals 2

    iget-wide v0, p0, Lzd/b3;->startTimeEpoch_:J

    return-wide v0
.end method

.method public i0()J
    .locals 2

    iget-wide v0, p0, Lzd/b3;->value_:J

    return-wide v0
.end method
