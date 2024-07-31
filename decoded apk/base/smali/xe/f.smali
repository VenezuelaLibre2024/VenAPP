.class public final Lxe/f;
.super Lcom/google/protobuf/x;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/s0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxe/f$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/x<",
        "Lxe/f;",
        "Lxe/f$b;",
        ">;",
        "Lcom/google/protobuf/s0;"
    }
.end annotation


# static fields
.field public static final CPU_CLOCK_RATE_KHZ_FIELD_NUMBER:I = 0x2

.field public static final CPU_PROCESSOR_COUNT_FIELD_NUMBER:I = 0x6

.field private static final DEFAULT_INSTANCE:Lxe/f;

.field public static final DEVICE_RAM_SIZE_KB_FIELD_NUMBER:I = 0x3

.field public static final MAX_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER:I = 0x4

.field public static final MAX_ENCOURAGED_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER:I = 0x5

.field private static volatile PARSER:Lcom/google/protobuf/z0; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/z0<",
            "Lxe/f;",
            ">;"
        }
    .end annotation
.end field

.field public static final PROCESS_NAME_FIELD_NUMBER:I = 0x1


# instance fields
.field private bitField0_:I

.field private cpuClockRateKhz_:I

.field private cpuProcessorCount_:I

.field private deviceRamSizeKb_:I

.field private maxAppJavaHeapMemoryKb_:I

.field private maxEncouragedAppJavaHeapMemoryKb_:I

.field private processName_:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lxe/f;

    invoke-direct {v0}, Lxe/f;-><init>()V

    sput-object v0, Lxe/f;->DEFAULT_INSTANCE:Lxe/f;

    const-class v1, Lxe/f;

    invoke-static {v1, v0}, Lcom/google/protobuf/x;->W(Ljava/lang/Class;Lcom/google/protobuf/x;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/protobuf/x;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lxe/f;->processName_:Ljava/lang/String;

    return-void
.end method

.method static synthetic Z()Lxe/f;
    .locals 1

    sget-object v0, Lxe/f;->DEFAULT_INSTANCE:Lxe/f;

    return-object v0
.end method

.method static synthetic b0(Lxe/f;I)V
    .locals 0

    invoke-direct {p0, p1}, Lxe/f;->j0(I)V

    return-void
.end method

.method static synthetic d0(Lxe/f;I)V
    .locals 0

    invoke-direct {p0, p1}, Lxe/f;->k0(I)V

    return-void
.end method

.method static synthetic e0(Lxe/f;I)V
    .locals 0

    invoke-direct {p0, p1}, Lxe/f;->i0(I)V

    return-void
.end method

.method public static f0()Lxe/f;
    .locals 1

    sget-object v0, Lxe/f;->DEFAULT_INSTANCE:Lxe/f;

    return-object v0
.end method

.method public static h0()Lxe/f$b;
    .locals 1

    sget-object v0, Lxe/f;->DEFAULT_INSTANCE:Lxe/f;

    invoke-virtual {v0}, Lcom/google/protobuf/x;->A()Lcom/google/protobuf/x$a;

    move-result-object v0

    check-cast v0, Lxe/f$b;

    return-object v0
.end method

.method private i0(I)V
    .locals 1

    iget v0, p0, Lxe/f;->bitField0_:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Lxe/f;->bitField0_:I

    iput p1, p0, Lxe/f;->deviceRamSizeKb_:I

    return-void
.end method

.method private j0(I)V
    .locals 1

    iget v0, p0, Lxe/f;->bitField0_:I

    or-int/lit8 v0, v0, 0x10

    iput v0, p0, Lxe/f;->bitField0_:I

    iput p1, p0, Lxe/f;->maxAppJavaHeapMemoryKb_:I

    return-void
.end method

.method private k0(I)V
    .locals 1

    iget v0, p0, Lxe/f;->bitField0_:I

    or-int/lit8 v0, v0, 0x20

    iput v0, p0, Lxe/f;->bitField0_:I

    iput p1, p0, Lxe/f;->maxEncouragedAppJavaHeapMemoryKb_:I

    return-void
.end method


# virtual methods
.method protected final E(Lcom/google/protobuf/x$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object p2, Lxe/f$a;->a:[I

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
    sget-object p1, Lxe/f;->PARSER:Lcom/google/protobuf/z0;

    if-nez p1, :cond_1

    const-class p2, Lxe/f;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lxe/f;->PARSER:Lcom/google/protobuf/z0;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/protobuf/x$b;

    sget-object p3, Lxe/f;->DEFAULT_INSTANCE:Lxe/f;

    invoke-direct {p1, p3}, Lcom/google/protobuf/x$b;-><init>(Lcom/google/protobuf/x;)V

    sput-object p1, Lxe/f;->PARSER:Lcom/google/protobuf/z0;

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
    sget-object p1, Lxe/f;->DEFAULT_INSTANCE:Lxe/f;

    return-object p1

    :pswitch_4
    const/4 p1, 0x7

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "bitField0_"

    aput-object v0, p1, p3

    const-string p3, "processName_"

    aput-object p3, p1, p2

    const/4 p2, 0x2

    const-string p3, "cpuClockRateKhz_"

    aput-object p3, p1, p2

    const/4 p2, 0x3

    const-string p3, "deviceRamSizeKb_"

    aput-object p3, p1, p2

    const/4 p2, 0x4

    const-string p3, "maxAppJavaHeapMemoryKb_"

    aput-object p3, p1, p2

    const/4 p2, 0x5

    const-string p3, "maxEncouragedAppJavaHeapMemoryKb_"

    aput-object p3, p1, p2

    const/4 p2, 0x6

    const-string p3, "cpuProcessorCount_"

    aput-object p3, p1, p2

    const-string p2, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1004\u0001\u0003\u1004\u0003\u0004\u1004\u0004\u0005\u1004\u0005\u0006\u1004\u0002"

    sget-object p3, Lxe/f;->DEFAULT_INSTANCE:Lxe/f;

    invoke-static {p3, p2, p1}, Lcom/google/protobuf/x;->T(Lcom/google/protobuf/r0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lxe/f$b;

    invoke-direct {p1, p3}, Lxe/f$b;-><init>(Lxe/f$a;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lxe/f;

    invoke-direct {p1}, Lxe/f;-><init>()V

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

.method public g0()Z
    .locals 1

    iget v0, p0, Lxe/f;->bitField0_:I

    and-int/lit8 v0, v0, 0x10

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
