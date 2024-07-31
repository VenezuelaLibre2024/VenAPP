.class public final Lpf/a;
.super Lcom/google/protobuf/x;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/s0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpf/a$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/x<",
        "Lpf/a;",
        "Lpf/a$b;",
        ">;",
        "Lcom/google/protobuf/s0;"
    }
.end annotation


# static fields
.field public static final CAMPAIGN_ID_FIELD_NUMBER:I = 0x1

.field private static final DEFAULT_INSTANCE:Lpf/a;

.field public static final IMPRESSION_TIMESTAMP_MILLIS_FIELD_NUMBER:I = 0x2

.field private static volatile PARSER:Lcom/google/protobuf/z0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/z0<",
            "Lpf/a;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private campaignId_:Ljava/lang/String;

.field private impressionTimestampMillis_:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lpf/a;

    invoke-direct {v0}, Lpf/a;-><init>()V

    sput-object v0, Lpf/a;->DEFAULT_INSTANCE:Lpf/a;

    const-class v1, Lpf/a;

    invoke-static {v1, v0}, Lcom/google/protobuf/x;->W(Ljava/lang/Class;Lcom/google/protobuf/x;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/protobuf/x;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lpf/a;->campaignId_:Ljava/lang/String;

    return-void
.end method

.method static synthetic Z()Lpf/a;
    .locals 1

    sget-object v0, Lpf/a;->DEFAULT_INSTANCE:Lpf/a;

    return-object v0
.end method

.method static synthetic b0(Lpf/a;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lpf/a;->g0(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic d0(Lpf/a;J)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lpf/a;->h0(J)V

    return-void
.end method

.method public static f0()Lpf/a$b;
    .locals 1

    sget-object v0, Lpf/a;->DEFAULT_INSTANCE:Lpf/a;

    invoke-virtual {v0}, Lcom/google/protobuf/x;->A()Lcom/google/protobuf/x$a;

    move-result-object v0

    check-cast v0, Lpf/a$b;

    return-object v0
.end method

.method private g0(Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lpf/a;->campaignId_:Ljava/lang/String;

    return-void
.end method

.method private h0(J)V
    .locals 0

    iput-wide p1, p0, Lpf/a;->impressionTimestampMillis_:J

    return-void
.end method


# virtual methods
.method protected final E(Lcom/google/protobuf/x$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object p2, Lpf/a$a;->a:[I

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
    sget-object p1, Lpf/a;->PARSER:Lcom/google/protobuf/z0;

    if-nez p1, :cond_1

    const-class p2, Lpf/a;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lpf/a;->PARSER:Lcom/google/protobuf/z0;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/protobuf/x$b;

    sget-object p3, Lpf/a;->DEFAULT_INSTANCE:Lpf/a;

    invoke-direct {p1, p3}, Lcom/google/protobuf/x$b;-><init>(Lcom/google/protobuf/x;)V

    sput-object p1, Lpf/a;->PARSER:Lcom/google/protobuf/z0;

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
    sget-object p1, Lpf/a;->DEFAULT_INSTANCE:Lpf/a;

    return-object p1

    :pswitch_4
    const/4 p1, 0x2

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "campaignId_"

    aput-object v0, p1, p3

    const-string p3, "impressionTimestampMillis_"

    aput-object p3, p1, p2

    const-string p2, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0002"

    sget-object p3, Lpf/a;->DEFAULT_INSTANCE:Lpf/a;

    invoke-static {p3, p2, p1}, Lcom/google/protobuf/x;->T(Lcom/google/protobuf/r0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lpf/a$b;

    invoke-direct {p1, p3}, Lpf/a$b;-><init>(Lpf/a$a;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lpf/a;

    invoke-direct {p1}, Lpf/a;-><init>()V

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

.method public e0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lpf/a;->campaignId_:Ljava/lang/String;

    return-object v0
.end method
