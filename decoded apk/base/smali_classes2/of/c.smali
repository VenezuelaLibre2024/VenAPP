.class public final Lof/c;
.super Lcom/google/protobuf/x;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/s0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lof/c$a;,
        Lof/c$b;,
        Lof/c$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/x<",
        "Lof/c;",
        "Lof/c$a;",
        ">;",
        "Lcom/google/protobuf/s0;"
    }
.end annotation


# static fields
.field public static final CONTENT_FIELD_NUMBER:I = 0x3

.field public static final DATA_BUNDLE_FIELD_NUMBER:I = 0x8

.field private static final DEFAULT_INSTANCE:Lof/c;

.field public static final EXPERIMENTAL_PAYLOAD_FIELD_NUMBER:I = 0x2

.field public static final IS_TEST_CAMPAIGN_FIELD_NUMBER:I = 0x7

.field private static volatile PARSER:Lcom/google/protobuf/z0; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/z0<",
            "Lof/c;",
            ">;"
        }
    .end annotation
.end field

.field public static final PRIORITY_FIELD_NUMBER:I = 0x4

.field public static final TRIGGERING_CONDITIONS_FIELD_NUMBER:I = 0x5

.field public static final VANILLA_PAYLOAD_FIELD_NUMBER:I = 0x1


# instance fields
.field private content_:Lqd/d0;

.field private dataBundle_:Lcom/google/protobuf/l0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/l0<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private isTestCampaign_:Z

.field private payloadCase_:I

.field private payload_:Ljava/lang/Object;

.field private priority_:Lqd/e;

.field private triggeringConditions_:Lcom/google/protobuf/z$i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/z$i<",
            "Lqd/h;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lof/c;

    invoke-direct {v0}, Lof/c;-><init>()V

    sput-object v0, Lof/c;->DEFAULT_INSTANCE:Lof/c;

    const-class v1, Lof/c;

    invoke-static {v1, v0}, Lcom/google/protobuf/x;->W(Ljava/lang/Class;Lcom/google/protobuf/x;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/protobuf/x;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lof/c;->payloadCase_:I

    invoke-static {}, Lcom/google/protobuf/l0;->d()Lcom/google/protobuf/l0;

    move-result-object v0

    iput-object v0, p0, Lof/c;->dataBundle_:Lcom/google/protobuf/l0;

    invoke-static {}, Lcom/google/protobuf/x;->G()Lcom/google/protobuf/z$i;

    move-result-object v0

    iput-object v0, p0, Lof/c;->triggeringConditions_:Lcom/google/protobuf/z$i;

    return-void
.end method

.method static synthetic Z()Lof/c;
    .locals 1

    sget-object v0, Lof/c;->DEFAULT_INSTANCE:Lof/c;

    return-object v0
.end method

.method private k0()Lcom/google/protobuf/l0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/l0<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lof/c;->dataBundle_:Lcom/google/protobuf/l0;

    return-object v0
.end method


# virtual methods
.method protected final E(Lcom/google/protobuf/x$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object p2, Lof/a;->a:[I

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
    sget-object p1, Lof/c;->PARSER:Lcom/google/protobuf/z0;

    if-nez p1, :cond_1

    const-class p2, Lof/c;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lof/c;->PARSER:Lcom/google/protobuf/z0;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/protobuf/x$b;

    sget-object p3, Lof/c;->DEFAULT_INSTANCE:Lof/c;

    invoke-direct {p1, p3}, Lcom/google/protobuf/x$b;-><init>(Lcom/google/protobuf/x;)V

    sput-object p1, Lof/c;->PARSER:Lcom/google/protobuf/z0;

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
    sget-object p1, Lof/c;->DEFAULT_INSTANCE:Lof/c;

    return-object p1

    :pswitch_4
    const/16 p1, 0xb

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "payload_"

    aput-object v0, p1, p3

    const-string p3, "payloadCase_"

    aput-object p3, p1, p2

    const/4 p2, 0x2

    const-class p3, Lof/d;

    aput-object p3, p1, p2

    const/4 p2, 0x3

    const-class p3, Lof/b;

    aput-object p3, p1, p2

    const/4 p2, 0x4

    const-string p3, "content_"

    aput-object p3, p1, p2

    const/4 p2, 0x5

    const-string p3, "priority_"

    aput-object p3, p1, p2

    const/4 p2, 0x6

    const-string p3, "triggeringConditions_"

    aput-object p3, p1, p2

    const/4 p2, 0x7

    const-class p3, Lqd/h;

    aput-object p3, p1, p2

    const/16 p2, 0x8

    const-string p3, "isTestCampaign_"

    aput-object p3, p1, p2

    const/16 p2, 0x9

    const-string p3, "dataBundle_"

    aput-object p3, p1, p2

    const/16 p2, 0xa

    sget-object p3, Lof/c$b;->a:Lcom/google/protobuf/k0;

    aput-object p3, p1, p2

    const-string p2, "\u0000\u0007\u0001\u0000\u0001\u0008\u0007\u0001\u0001\u0000\u0001<\u0000\u0002<\u0000\u0003\t\u0004\t\u0005\u001b\u0007\u0007\u00082"

    sget-object p3, Lof/c;->DEFAULT_INSTANCE:Lof/c;

    invoke-static {p3, p2, p1}, Lcom/google/protobuf/x;->T(Lcom/google/protobuf/r0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lof/c$a;

    invoke-direct {p1, p3}, Lof/c$a;-><init>(Lof/a;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lof/c;

    invoke-direct {p1}, Lof/c;-><init>()V

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

.method public b0()Lqd/d0;
    .locals 1

    iget-object v0, p0, Lof/c;->content_:Lqd/d0;

    if-nez v0, :cond_0

    invoke-static {}, Lqd/d0;->e0()Lqd/d0;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public d0()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lof/c;->k0()Lcom/google/protobuf/l0;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public e0()Lof/b;
    .locals 2

    iget v0, p0, Lof/c;->payloadCase_:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lof/c;->payload_:Ljava/lang/Object;

    check-cast v0, Lof/b;

    return-object v0

    :cond_0
    invoke-static {}, Lof/b;->g0()Lof/b;

    move-result-object v0

    return-object v0
.end method

.method public f0()Z
    .locals 1

    iget-boolean v0, p0, Lof/c;->isTestCampaign_:Z

    return v0
.end method

.method public g0()Lof/c$c;
    .locals 1

    iget v0, p0, Lof/c;->payloadCase_:I

    invoke-static {v0}, Lof/c$c;->b(I)Lof/c$c;

    move-result-object v0

    return-object v0
.end method

.method public h0()Lqd/e;
    .locals 1

    iget-object v0, p0, Lof/c;->priority_:Lqd/e;

    if-nez v0, :cond_0

    invoke-static {}, Lqd/e;->b0()Lqd/e;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public i0()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lqd/h;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lof/c;->triggeringConditions_:Lcom/google/protobuf/z$i;

    return-object v0
.end method

.method public j0()Lof/d;
    .locals 2

    iget v0, p0, Lof/c;->payloadCase_:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lof/c;->payload_:Ljava/lang/Object;

    check-cast v0, Lof/d;

    return-object v0

    :cond_0
    invoke-static {}, Lof/d;->g0()Lof/d;

    move-result-object v0

    return-object v0
.end method
