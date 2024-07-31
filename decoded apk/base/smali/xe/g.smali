.class public final Lxe/g;
.super Lcom/google/protobuf/x;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/s0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxe/g$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/x<",
        "Lxe/g;",
        "Lxe/g$b;",
        ">;",
        "Lcom/google/protobuf/s0;"
    }
.end annotation


# static fields
.field public static final ANDROID_MEMORY_READINGS_FIELD_NUMBER:I = 0x4

.field public static final CPU_METRIC_READINGS_FIELD_NUMBER:I = 0x2

.field private static final DEFAULT_INSTANCE:Lxe/g;

.field public static final GAUGE_METADATA_FIELD_NUMBER:I = 0x3

.field private static volatile PARSER:Lcom/google/protobuf/z0; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/z0<",
            "Lxe/g;",
            ">;"
        }
    .end annotation
.end field

.field public static final SESSION_ID_FIELD_NUMBER:I = 0x1


# instance fields
.field private androidMemoryReadings_:Lcom/google/protobuf/z$i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/z$i<",
            "Lxe/b;",
            ">;"
        }
    .end annotation
.end field

.field private bitField0_:I

.field private cpuMetricReadings_:Lcom/google/protobuf/z$i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/z$i<",
            "Lxe/e;",
            ">;"
        }
    .end annotation
.end field

.field private gaugeMetadata_:Lxe/f;

.field private sessionId_:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lxe/g;

    invoke-direct {v0}, Lxe/g;-><init>()V

    sput-object v0, Lxe/g;->DEFAULT_INSTANCE:Lxe/g;

    const-class v1, Lxe/g;

    invoke-static {v1, v0}, Lcom/google/protobuf/x;->W(Ljava/lang/Class;Lcom/google/protobuf/x;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/protobuf/x;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lxe/g;->sessionId_:Ljava/lang/String;

    invoke-static {}, Lcom/google/protobuf/x;->G()Lcom/google/protobuf/z$i;

    move-result-object v0

    iput-object v0, p0, Lxe/g;->cpuMetricReadings_:Lcom/google/protobuf/z$i;

    invoke-static {}, Lcom/google/protobuf/x;->G()Lcom/google/protobuf/z$i;

    move-result-object v0

    iput-object v0, p0, Lxe/g;->androidMemoryReadings_:Lcom/google/protobuf/z$i;

    return-void
.end method

.method static synthetic Z()Lxe/g;
    .locals 1

    sget-object v0, Lxe/g;->DEFAULT_INSTANCE:Lxe/g;

    return-object v0
.end method

.method static synthetic b0(Lxe/g;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lxe/g;->s0(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic d0(Lxe/g;Lxe/b;)V
    .locals 0

    invoke-direct {p0, p1}, Lxe/g;->g0(Lxe/b;)V

    return-void
.end method

.method static synthetic e0(Lxe/g;Lxe/f;)V
    .locals 0

    invoke-direct {p0, p1}, Lxe/g;->r0(Lxe/f;)V

    return-void
.end method

.method static synthetic f0(Lxe/g;Lxe/e;)V
    .locals 0

    invoke-direct {p0, p1}, Lxe/g;->h0(Lxe/e;)V

    return-void
.end method

.method private g0(Lxe/b;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {p0}, Lxe/g;->i0()V

    iget-object v0, p0, Lxe/g;->androidMemoryReadings_:Lcom/google/protobuf/z$i;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private h0(Lxe/e;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {p0}, Lxe/g;->j0()V

    iget-object v0, p0, Lxe/g;->cpuMetricReadings_:Lcom/google/protobuf/z$i;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private i0()V
    .locals 2

    iget-object v0, p0, Lxe/g;->androidMemoryReadings_:Lcom/google/protobuf/z$i;

    invoke-interface {v0}, Lcom/google/protobuf/z$i;->g()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/google/protobuf/x;->R(Lcom/google/protobuf/z$i;)Lcom/google/protobuf/z$i;

    move-result-object v0

    iput-object v0, p0, Lxe/g;->androidMemoryReadings_:Lcom/google/protobuf/z$i;

    :cond_0
    return-void
.end method

.method private j0()V
    .locals 2

    iget-object v0, p0, Lxe/g;->cpuMetricReadings_:Lcom/google/protobuf/z$i;

    invoke-interface {v0}, Lcom/google/protobuf/z$i;->g()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/google/protobuf/x;->R(Lcom/google/protobuf/z$i;)Lcom/google/protobuf/z$i;

    move-result-object v0

    iput-object v0, p0, Lxe/g;->cpuMetricReadings_:Lcom/google/protobuf/z$i;

    :cond_0
    return-void
.end method

.method public static m0()Lxe/g;
    .locals 1

    sget-object v0, Lxe/g;->DEFAULT_INSTANCE:Lxe/g;

    return-object v0
.end method

.method public static q0()Lxe/g$b;
    .locals 1

    sget-object v0, Lxe/g;->DEFAULT_INSTANCE:Lxe/g;

    invoke-virtual {v0}, Lcom/google/protobuf/x;->A()Lcom/google/protobuf/x$a;

    move-result-object v0

    check-cast v0, Lxe/g$b;

    return-object v0
.end method

.method private r0(Lxe/f;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lxe/g;->gaugeMetadata_:Lxe/f;

    iget p1, p0, Lxe/g;->bitField0_:I

    or-int/lit8 p1, p1, 0x2

    iput p1, p0, Lxe/g;->bitField0_:I

    return-void
.end method

.method private s0(Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Lxe/g;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lxe/g;->bitField0_:I

    iput-object p1, p0, Lxe/g;->sessionId_:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method protected final E(Lcom/google/protobuf/x$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object p2, Lxe/g$a;->a:[I

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
    sget-object p1, Lxe/g;->PARSER:Lcom/google/protobuf/z0;

    if-nez p1, :cond_1

    const-class p2, Lxe/g;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lxe/g;->PARSER:Lcom/google/protobuf/z0;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/protobuf/x$b;

    sget-object p3, Lxe/g;->DEFAULT_INSTANCE:Lxe/g;

    invoke-direct {p1, p3}, Lcom/google/protobuf/x$b;-><init>(Lcom/google/protobuf/x;)V

    sput-object p1, Lxe/g;->PARSER:Lcom/google/protobuf/z0;

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
    sget-object p1, Lxe/g;->DEFAULT_INSTANCE:Lxe/g;

    return-object p1

    :pswitch_4
    const/4 p1, 0x7

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "bitField0_"

    aput-object v0, p1, p3

    const-string p3, "sessionId_"

    aput-object p3, p1, p2

    const/4 p2, 0x2

    const-string p3, "cpuMetricReadings_"

    aput-object p3, p1, p2

    const/4 p2, 0x3

    const-class p3, Lxe/e;

    aput-object p3, p1, p2

    const/4 p2, 0x4

    const-string p3, "gaugeMetadata_"

    aput-object p3, p1, p2

    const/4 p2, 0x5

    const-string p3, "androidMemoryReadings_"

    aput-object p3, p1, p2

    const/4 p2, 0x6

    const-class p3, Lxe/b;

    aput-object p3, p1, p2

    const-string p2, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001\u1008\u0000\u0002\u001b\u0003\u1009\u0001\u0004\u001b"

    sget-object p3, Lxe/g;->DEFAULT_INSTANCE:Lxe/g;

    invoke-static {p3, p2, p1}, Lcom/google/protobuf/x;->T(Lcom/google/protobuf/r0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lxe/g$b;

    invoke-direct {p1, p3}, Lxe/g$b;-><init>(Lxe/g$a;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lxe/g;

    invoke-direct {p1}, Lxe/g;-><init>()V

    return-object p1

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

.method public k0()I
    .locals 1

    iget-object v0, p0, Lxe/g;->androidMemoryReadings_:Lcom/google/protobuf/z$i;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public l0()I
    .locals 1

    iget-object v0, p0, Lxe/g;->cpuMetricReadings_:Lcom/google/protobuf/z$i;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public n0()Lxe/f;
    .locals 1

    iget-object v0, p0, Lxe/g;->gaugeMetadata_:Lxe/f;

    if-nez v0, :cond_0

    invoke-static {}, Lxe/f;->f0()Lxe/f;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public o0()Z
    .locals 1

    iget v0, p0, Lxe/g;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public p0()Z
    .locals 2

    iget v0, p0, Lxe/g;->bitField0_:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method
