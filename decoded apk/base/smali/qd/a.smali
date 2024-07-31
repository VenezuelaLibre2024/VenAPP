.class public final Lqd/a;
.super Lcom/google/protobuf/x;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/s0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqd/a$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/x<",
        "Lqd/a;",
        "Lqd/a$b;",
        ">;",
        "Lcom/google/protobuf/s0;"
    }
.end annotation


# static fields
.field public static final CAMPAIGN_ID_FIELD_NUMBER:I = 0x2

.field public static final CLIENT_APP_FIELD_NUMBER:I = 0x3

.field public static final CLIENT_TIMESTAMP_MILLIS_FIELD_NUMBER:I = 0x4

.field private static final DEFAULT_INSTANCE:Lqd/a;

.field public static final DISMISS_TYPE_FIELD_NUMBER:I = 0x6

.field public static final ENGAGEMENTMETRICS_DELIVERY_RETRY_COUNT_FIELD_NUMBER:I = 0xa

.field public static final EVENT_TYPE_FIELD_NUMBER:I = 0x5

.field public static final FETCH_ERROR_REASON_FIELD_NUMBER:I = 0x8

.field public static final FIAM_SDK_VERSION_FIELD_NUMBER:I = 0x9

.field private static volatile PARSER:Lcom/google/protobuf/z0; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/z0<",
            "Lqd/a;",
            ">;"
        }
    .end annotation
.end field

.field public static final PROJECT_NUMBER_FIELD_NUMBER:I = 0x1

.field public static final RENDER_ERROR_REASON_FIELD_NUMBER:I = 0x7


# instance fields
.field private bitField0_:I

.field private campaignId_:Ljava/lang/String;

.field private clientApp_:Lqd/b;

.field private clientTimestampMillis_:J

.field private engagementMetricsDeliveryRetryCount_:I

.field private eventCase_:I

.field private event_:Ljava/lang/Object;

.field private fiamSdkVersion_:Ljava/lang/String;

.field private projectNumber_:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lqd/a;

    invoke-direct {v0}, Lqd/a;-><init>()V

    sput-object v0, Lqd/a;->DEFAULT_INSTANCE:Lqd/a;

    const-class v1, Lqd/a;

    invoke-static {v1, v0}, Lcom/google/protobuf/x;->W(Ljava/lang/Class;Lcom/google/protobuf/x;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/protobuf/x;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lqd/a;->eventCase_:I

    const-string v0, ""

    iput-object v0, p0, Lqd/a;->projectNumber_:Ljava/lang/String;

    iput-object v0, p0, Lqd/a;->campaignId_:Ljava/lang/String;

    iput-object v0, p0, Lqd/a;->fiamSdkVersion_:Ljava/lang/String;

    return-void
.end method

.method static synthetic Z()Lqd/a;
    .locals 1

    sget-object v0, Lqd/a;->DEFAULT_INSTANCE:Lqd/a;

    return-object v0
.end method

.method static synthetic b0(Lqd/a;J)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lqd/a;->n0(J)V

    return-void
.end method

.method static synthetic d0(Lqd/a;Lqd/j;)V
    .locals 0

    invoke-direct {p0, p1}, Lqd/a;->p0(Lqd/j;)V

    return-void
.end method

.method static synthetic e0(Lqd/a;Lqd/i;)V
    .locals 0

    invoke-direct {p0, p1}, Lqd/a;->o0(Lqd/i;)V

    return-void
.end method

.method static synthetic f0(Lqd/a;Lqd/h0;)V
    .locals 0

    invoke-direct {p0, p1}, Lqd/a;->s0(Lqd/h0;)V

    return-void
.end method

.method static synthetic g0(Lqd/a;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lqd/a;->r0(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic h0(Lqd/a;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lqd/a;->q0(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic i0(Lqd/a;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lqd/a;->l0(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic j0(Lqd/a;Lqd/b;)V
    .locals 0

    invoke-direct {p0, p1}, Lqd/a;->m0(Lqd/b;)V

    return-void
.end method

.method public static k0()Lqd/a$b;
    .locals 1

    sget-object v0, Lqd/a;->DEFAULT_INSTANCE:Lqd/a;

    invoke-virtual {v0}, Lcom/google/protobuf/x;->A()Lcom/google/protobuf/x$a;

    move-result-object v0

    check-cast v0, Lqd/a$b;

    return-object v0
.end method

.method private l0(Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Lqd/a;->bitField0_:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lqd/a;->bitField0_:I

    iput-object p1, p0, Lqd/a;->campaignId_:Ljava/lang/String;

    return-void
.end method

.method private m0(Lqd/b;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lqd/a;->clientApp_:Lqd/b;

    iget p1, p0, Lqd/a;->bitField0_:I

    or-int/lit8 p1, p1, 0x4

    iput p1, p0, Lqd/a;->bitField0_:I

    return-void
.end method

.method private n0(J)V
    .locals 1

    iget v0, p0, Lqd/a;->bitField0_:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Lqd/a;->bitField0_:I

    iput-wide p1, p0, Lqd/a;->clientTimestampMillis_:J

    return-void
.end method

.method private o0(Lqd/i;)V
    .locals 0

    invoke-virtual {p1}, Lqd/i;->a()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lqd/a;->event_:Ljava/lang/Object;

    const/4 p1, 0x6

    iput p1, p0, Lqd/a;->eventCase_:I

    return-void
.end method

.method private p0(Lqd/j;)V
    .locals 0

    invoke-virtual {p1}, Lqd/j;->a()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lqd/a;->event_:Ljava/lang/Object;

    const/4 p1, 0x5

    iput p1, p0, Lqd/a;->eventCase_:I

    return-void
.end method

.method private q0(Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Lqd/a;->bitField0_:I

    or-int/lit16 v0, v0, 0x100

    iput v0, p0, Lqd/a;->bitField0_:I

    iput-object p1, p0, Lqd/a;->fiamSdkVersion_:Ljava/lang/String;

    return-void
.end method

.method private r0(Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Lqd/a;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lqd/a;->bitField0_:I

    iput-object p1, p0, Lqd/a;->projectNumber_:Ljava/lang/String;

    return-void
.end method

.method private s0(Lqd/h0;)V
    .locals 0

    invoke-virtual {p1}, Lqd/h0;->a()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lqd/a;->event_:Ljava/lang/Object;

    const/4 p1, 0x7

    iput p1, p0, Lqd/a;->eventCase_:I

    return-void
.end method


# virtual methods
.method protected final E(Lcom/google/protobuf/x$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object p2, Lqd/a$a;->a:[I

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
    sget-object p1, Lqd/a;->PARSER:Lcom/google/protobuf/z0;

    if-nez p1, :cond_1

    const-class p2, Lqd/a;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lqd/a;->PARSER:Lcom/google/protobuf/z0;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/protobuf/x$b;

    sget-object p3, Lqd/a;->DEFAULT_INSTANCE:Lqd/a;

    invoke-direct {p1, p3}, Lcom/google/protobuf/x$b;-><init>(Lcom/google/protobuf/x;)V

    sput-object p1, Lqd/a;->PARSER:Lcom/google/protobuf/z0;

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
    sget-object p1, Lqd/a;->DEFAULT_INSTANCE:Lqd/a;

    return-object p1

    :pswitch_4
    const/16 p1, 0xd

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "event_"

    aput-object v0, p1, p3

    const-string p3, "eventCase_"

    aput-object p3, p1, p2

    const/4 p2, 0x2

    const-string p3, "bitField0_"

    aput-object p3, p1, p2

    const/4 p2, 0x3

    const-string p3, "projectNumber_"

    aput-object p3, p1, p2

    const/4 p2, 0x4

    const-string p3, "campaignId_"

    aput-object p3, p1, p2

    const/4 p2, 0x5

    const-string p3, "clientApp_"

    aput-object p3, p1, p2

    const/4 p2, 0x6

    const-string p3, "clientTimestampMillis_"

    aput-object p3, p1, p2

    const/4 p2, 0x7

    invoke-static {}, Lqd/j;->h()Lcom/google/protobuf/z$e;

    move-result-object p3

    aput-object p3, p1, p2

    const/16 p2, 0x8

    invoke-static {}, Lqd/i;->h()Lcom/google/protobuf/z$e;

    move-result-object p3

    aput-object p3, p1, p2

    const/16 p2, 0x9

    invoke-static {}, Lqd/h0;->h()Lcom/google/protobuf/z$e;

    move-result-object p3

    aput-object p3, p1, p2

    const/16 p2, 0xa

    invoke-static {}, Lqd/n;->h()Lcom/google/protobuf/z$e;

    move-result-object p3

    aput-object p3, p1, p2

    const/16 p2, 0xb

    const-string p3, "fiamSdkVersion_"

    aput-object p3, p1, p2

    const/16 p2, 0xc

    const-string p3, "engagementMetricsDeliveryRetryCount_"

    aput-object p3, p1, p2

    const-string p2, "\u0001\n\u0001\u0001\u0001\n\n\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1009\u0002\u0004\u1002\u0003\u0005\u103f\u0000\u0006\u103f\u0000\u0007\u103f\u0000\u0008\u103f\u0000\t\u1008\u0008\n\u1004\t"

    sget-object p3, Lqd/a;->DEFAULT_INSTANCE:Lqd/a;

    invoke-static {p3, p2, p1}, Lcom/google/protobuf/x;->T(Lcom/google/protobuf/r0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lqd/a$b;

    invoke-direct {p1, p3}, Lqd/a$b;-><init>(Lqd/a$a;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lqd/a;

    invoke-direct {p1}, Lqd/a;-><init>()V

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
