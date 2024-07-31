.class public final Lxe/i;
.super Lcom/google/protobuf/x;
.source "SourceFile"

# interfaces
.implements Lxe/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxe/i$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/x<",
        "Lxe/i;",
        "Lxe/i$b;",
        ">;",
        "Lxe/j;"
    }
.end annotation


# static fields
.field public static final APPLICATION_INFO_FIELD_NUMBER:I = 0x1

.field private static final DEFAULT_INSTANCE:Lxe/i;

.field public static final GAUGE_METRIC_FIELD_NUMBER:I = 0x4

.field public static final NETWORK_REQUEST_METRIC_FIELD_NUMBER:I = 0x3

.field private static volatile PARSER:Lcom/google/protobuf/z0; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/z0<",
            "Lxe/i;",
            ">;"
        }
    .end annotation
.end field

.field public static final TRACE_METRIC_FIELD_NUMBER:I = 0x2

.field public static final TRANSPORT_INFO_FIELD_NUMBER:I = 0x5


# instance fields
.field private applicationInfo_:Lxe/c;

.field private bitField0_:I

.field private gaugeMetric_:Lxe/g;

.field private networkRequestMetric_:Lxe/h;

.field private traceMetric_:Lxe/m;

.field private transportInfo_:Lxe/n;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lxe/i;

    invoke-direct {v0}, Lxe/i;-><init>()V

    sput-object v0, Lxe/i;->DEFAULT_INSTANCE:Lxe/i;

    const-class v1, Lxe/i;

    invoke-static {v1, v0}, Lcom/google/protobuf/x;->W(Ljava/lang/Class;Lcom/google/protobuf/x;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/protobuf/x;-><init>()V

    return-void
.end method

.method static synthetic Z()Lxe/i;
    .locals 1

    sget-object v0, Lxe/i;->DEFAULT_INSTANCE:Lxe/i;

    return-object v0
.end method

.method static synthetic b0(Lxe/i;Lxe/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lxe/i;->j0(Lxe/c;)V

    return-void
.end method

.method static synthetic d0(Lxe/i;Lxe/g;)V
    .locals 0

    invoke-direct {p0, p1}, Lxe/i;->k0(Lxe/g;)V

    return-void
.end method

.method static synthetic e0(Lxe/i;Lxe/m;)V
    .locals 0

    invoke-direct {p0, p1}, Lxe/i;->m0(Lxe/m;)V

    return-void
.end method

.method static synthetic f0(Lxe/i;Lxe/h;)V
    .locals 0

    invoke-direct {p0, p1}, Lxe/i;->l0(Lxe/h;)V

    return-void
.end method

.method public static i0()Lxe/i$b;
    .locals 1

    sget-object v0, Lxe/i;->DEFAULT_INSTANCE:Lxe/i;

    invoke-virtual {v0}, Lcom/google/protobuf/x;->A()Lcom/google/protobuf/x$a;

    move-result-object v0

    check-cast v0, Lxe/i$b;

    return-object v0
.end method

.method private j0(Lxe/c;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lxe/i;->applicationInfo_:Lxe/c;

    iget p1, p0, Lxe/i;->bitField0_:I

    or-int/lit8 p1, p1, 0x1

    iput p1, p0, Lxe/i;->bitField0_:I

    return-void
.end method

.method private k0(Lxe/g;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lxe/i;->gaugeMetric_:Lxe/g;

    iget p1, p0, Lxe/i;->bitField0_:I

    or-int/lit8 p1, p1, 0x8

    iput p1, p0, Lxe/i;->bitField0_:I

    return-void
.end method

.method private l0(Lxe/h;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lxe/i;->networkRequestMetric_:Lxe/h;

    iget p1, p0, Lxe/i;->bitField0_:I

    or-int/lit8 p1, p1, 0x4

    iput p1, p0, Lxe/i;->bitField0_:I

    return-void
.end method

.method private m0(Lxe/m;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lxe/i;->traceMetric_:Lxe/m;

    iget p1, p0, Lxe/i;->bitField0_:I

    or-int/lit8 p1, p1, 0x2

    iput p1, p0, Lxe/i;->bitField0_:I

    return-void
.end method


# virtual methods
.method protected final E(Lcom/google/protobuf/x$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object p2, Lxe/i$a;->a:[I

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
    sget-object p1, Lxe/i;->PARSER:Lcom/google/protobuf/z0;

    if-nez p1, :cond_1

    const-class p2, Lxe/i;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lxe/i;->PARSER:Lcom/google/protobuf/z0;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/protobuf/x$b;

    sget-object p3, Lxe/i;->DEFAULT_INSTANCE:Lxe/i;

    invoke-direct {p1, p3}, Lcom/google/protobuf/x$b;-><init>(Lcom/google/protobuf/x;)V

    sput-object p1, Lxe/i;->PARSER:Lcom/google/protobuf/z0;

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
    sget-object p1, Lxe/i;->DEFAULT_INSTANCE:Lxe/i;

    return-object p1

    :pswitch_4
    const/4 p1, 0x6

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "bitField0_"

    aput-object v0, p1, p3

    const-string p3, "applicationInfo_"

    aput-object p3, p1, p2

    const/4 p2, 0x2

    const-string p3, "traceMetric_"

    aput-object p3, p1, p2

    const/4 p2, 0x3

    const-string p3, "networkRequestMetric_"

    aput-object p3, p1, p2

    const/4 p2, 0x4

    const-string p3, "gaugeMetric_"

    aput-object p3, p1, p2

    const/4 p2, 0x5

    const-string p3, "transportInfo_"

    aput-object p3, p1, p2

    const-string p2, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001\u0003\u1009\u0002\u0004\u1009\u0003\u0005\u1009\u0004"

    sget-object p3, Lxe/i;->DEFAULT_INSTANCE:Lxe/i;

    invoke-static {p3, p2, p1}, Lcom/google/protobuf/x;->T(Lcom/google/protobuf/r0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lxe/i$b;

    invoke-direct {p1, p3}, Lxe/i$b;-><init>(Lxe/i$a;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lxe/i;

    invoke-direct {p1}, Lxe/i;-><init>()V

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

.method public g0()Lxe/c;
    .locals 1

    iget-object v0, p0, Lxe/i;->applicationInfo_:Lxe/c;

    if-nez v0, :cond_0

    invoke-static {}, Lxe/c;->i0()Lxe/c;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public h0()Z
    .locals 2

    iget v0, p0, Lxe/i;->bitField0_:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public i()Z
    .locals 1

    iget v0, p0, Lxe/i;->bitField0_:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public j()Z
    .locals 1

    iget v0, p0, Lxe/i;->bitField0_:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public k()Lxe/h;
    .locals 1

    iget-object v0, p0, Lxe/i;->networkRequestMetric_:Lxe/h;

    if-nez v0, :cond_0

    invoke-static {}, Lxe/h;->u0()Lxe/h;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public m()Z
    .locals 1

    iget v0, p0, Lxe/i;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public p()Lxe/m;
    .locals 1

    iget-object v0, p0, Lxe/i;->traceMetric_:Lxe/m;

    if-nez v0, :cond_0

    invoke-static {}, Lxe/m;->v0()Lxe/m;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public q()Lxe/g;
    .locals 1

    iget-object v0, p0, Lxe/i;->gaugeMetric_:Lxe/g;

    if-nez v0, :cond_0

    invoke-static {}, Lxe/g;->m0()Lxe/g;

    move-result-object v0

    :cond_0
    return-object v0
.end method
