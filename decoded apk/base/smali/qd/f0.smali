.class public final Lqd/f0;
.super Lcom/google/protobuf/x;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/s0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqd/f0$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/x<",
        "Lqd/f0;",
        "Lqd/f0$a;",
        ">;",
        "Lcom/google/protobuf/s0;"
    }
.end annotation


# static fields
.field public static final ACTION_BUTTON_FIELD_NUMBER:I = 0x4

.field public static final ACTION_FIELD_NUMBER:I = 0x5

.field public static final BACKGROUND_HEX_COLOR_FIELD_NUMBER:I = 0x6

.field public static final BODY_FIELD_NUMBER:I = 0x2

.field private static final DEFAULT_INSTANCE:Lqd/f0;

.field public static final IMAGE_URL_FIELD_NUMBER:I = 0x3

.field private static volatile PARSER:Lcom/google/protobuf/z0; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/z0<",
            "Lqd/f0;",
            ">;"
        }
    .end annotation
.end field

.field public static final TITLE_FIELD_NUMBER:I = 0x1


# instance fields
.field private actionButton_:Lqd/b0;

.field private action_:Lqd/z;

.field private backgroundHexColor_:Ljava/lang/String;

.field private body_:Lqd/g0;

.field private imageUrl_:Ljava/lang/String;

.field private title_:Lqd/g0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lqd/f0;

    invoke-direct {v0}, Lqd/f0;-><init>()V

    sput-object v0, Lqd/f0;->DEFAULT_INSTANCE:Lqd/f0;

    const-class v1, Lqd/f0;

    invoke-static {v1, v0}, Lcom/google/protobuf/x;->W(Ljava/lang/Class;Lcom/google/protobuf/x;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/protobuf/x;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lqd/f0;->imageUrl_:Ljava/lang/String;

    iput-object v0, p0, Lqd/f0;->backgroundHexColor_:Ljava/lang/String;

    return-void
.end method

.method static synthetic Z()Lqd/f0;
    .locals 1

    sget-object v0, Lqd/f0;->DEFAULT_INSTANCE:Lqd/f0;

    return-object v0
.end method

.method public static g0()Lqd/f0;
    .locals 1

    sget-object v0, Lqd/f0;->DEFAULT_INSTANCE:Lqd/f0;

    return-object v0
.end method


# virtual methods
.method protected final E(Lcom/google/protobuf/x$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object p2, Lqd/y;->a:[I

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
    sget-object p1, Lqd/f0;->PARSER:Lcom/google/protobuf/z0;

    if-nez p1, :cond_1

    const-class p2, Lqd/f0;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lqd/f0;->PARSER:Lcom/google/protobuf/z0;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/protobuf/x$b;

    sget-object p3, Lqd/f0;->DEFAULT_INSTANCE:Lqd/f0;

    invoke-direct {p1, p3}, Lcom/google/protobuf/x$b;-><init>(Lcom/google/protobuf/x;)V

    sput-object p1, Lqd/f0;->PARSER:Lcom/google/protobuf/z0;

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
    sget-object p1, Lqd/f0;->DEFAULT_INSTANCE:Lqd/f0;

    return-object p1

    :pswitch_4
    const/4 p1, 0x6

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "title_"

    aput-object v0, p1, p3

    const-string p3, "body_"

    aput-object p3, p1, p2

    const/4 p2, 0x2

    const-string p3, "imageUrl_"

    aput-object p3, p1, p2

    const/4 p2, 0x3

    const-string p3, "actionButton_"

    aput-object p3, p1, p2

    const/4 p2, 0x4

    const-string p3, "action_"

    aput-object p3, p1, p2

    const/4 p2, 0x5

    const-string p3, "backgroundHexColor_"

    aput-object p3, p1, p2

    const-string p2, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\t\u0002\t\u0003\u0208\u0004\t\u0005\t\u0006\u0208"

    sget-object p3, Lqd/f0;->DEFAULT_INSTANCE:Lqd/f0;

    invoke-static {p3, p2, p1}, Lcom/google/protobuf/x;->T(Lcom/google/protobuf/r0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lqd/f0$a;

    invoke-direct {p1, p3}, Lqd/f0$a;-><init>(Lqd/y;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lqd/f0;

    invoke-direct {p1}, Lqd/f0;-><init>()V

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

.method public b0()Lqd/z;
    .locals 1

    iget-object v0, p0, Lqd/f0;->action_:Lqd/z;

    if-nez v0, :cond_0

    invoke-static {}, Lqd/z;->d0()Lqd/z;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public d0()Lqd/b0;
    .locals 1

    iget-object v0, p0, Lqd/f0;->actionButton_:Lqd/b0;

    if-nez v0, :cond_0

    invoke-static {}, Lqd/b0;->d0()Lqd/b0;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public e0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lqd/f0;->backgroundHexColor_:Ljava/lang/String;

    return-object v0
.end method

.method public f0()Lqd/g0;
    .locals 1

    iget-object v0, p0, Lqd/f0;->body_:Lqd/g0;

    if-nez v0, :cond_0

    invoke-static {}, Lqd/g0;->b0()Lqd/g0;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public h0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lqd/f0;->imageUrl_:Ljava/lang/String;

    return-object v0
.end method

.method public i0()Lqd/g0;
    .locals 1

    iget-object v0, p0, Lqd/f0;->title_:Lqd/g0;

    if-nez v0, :cond_0

    invoke-static {}, Lqd/g0;->b0()Lqd/g0;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public j0()Z
    .locals 1

    iget-object v0, p0, Lqd/f0;->action_:Lqd/z;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public k0()Z
    .locals 1

    iget-object v0, p0, Lqd/f0;->body_:Lqd/g0;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public l0()Z
    .locals 1

    iget-object v0, p0, Lqd/f0;->title_:Lqd/g0;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
