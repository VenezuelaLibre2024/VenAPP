.class public final Lvb/c0$c;
.super Lcom/google/crypto/tink/shaded/protobuf/y;
.source "SourceFile"

# interfaces
.implements Lcom/google/crypto/tink/shaded/protobuf/s0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lvb/c0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lvb/c0$c$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/crypto/tink/shaded/protobuf/y<",
        "Lvb/c0$c;",
        "Lvb/c0$c$a;",
        ">;",
        "Lcom/google/crypto/tink/shaded/protobuf/s0;"
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:Lvb/c0$c;

.field public static final KEY_DATA_FIELD_NUMBER:I = 0x1

.field public static final KEY_ID_FIELD_NUMBER:I = 0x3

.field public static final OUTPUT_PREFIX_TYPE_FIELD_NUMBER:I = 0x4

.field private static volatile PARSER:Lcom/google/crypto/tink/shaded/protobuf/z0; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/crypto/tink/shaded/protobuf/z0<",
            "Lvb/c0$c;",
            ">;"
        }
    .end annotation
.end field

.field public static final STATUS_FIELD_NUMBER:I = 0x2


# instance fields
.field private keyData_:Lvb/y;

.field private keyId_:I

.field private outputPrefixType_:I

.field private status_:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lvb/c0$c;

    invoke-direct {v0}, Lvb/c0$c;-><init>()V

    sput-object v0, Lvb/c0$c;->DEFAULT_INSTANCE:Lvb/c0$c;

    const-class v1, Lvb/c0$c;

    invoke-static {v1, v0}, Lcom/google/crypto/tink/shaded/protobuf/y;->S(Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/y;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/crypto/tink/shaded/protobuf/y;-><init>()V

    return-void
.end method

.method static synthetic V()Lvb/c0$c;
    .locals 1

    sget-object v0, Lvb/c0$c;->DEFAULT_INSTANCE:Lvb/c0$c;

    return-object v0
.end method

.method static synthetic W(Lvb/c0$c;Lvb/y;)V
    .locals 0

    invoke-direct {p0, p1}, Lvb/c0$c;->g0(Lvb/y;)V

    return-void
.end method

.method static synthetic X(Lvb/c0$c;Lvb/i0;)V
    .locals 0

    invoke-direct {p0, p1}, Lvb/c0$c;->i0(Lvb/i0;)V

    return-void
.end method

.method static synthetic Y(Lvb/c0$c;Lvb/z;)V
    .locals 0

    invoke-direct {p0, p1}, Lvb/c0$c;->j0(Lvb/z;)V

    return-void
.end method

.method static synthetic Z(Lvb/c0$c;I)V
    .locals 0

    invoke-direct {p0, p1}, Lvb/c0$c;->h0(I)V

    return-void
.end method

.method public static f0()Lvb/c0$c$a;
    .locals 1

    sget-object v0, Lvb/c0$c;->DEFAULT_INSTANCE:Lvb/c0$c;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/y;->u()Lcom/google/crypto/tink/shaded/protobuf/y$a;

    move-result-object v0

    check-cast v0, Lvb/c0$c$a;

    return-object v0
.end method

.method private g0(Lvb/y;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lvb/c0$c;->keyData_:Lvb/y;

    return-void
.end method

.method private h0(I)V
    .locals 0

    iput p1, p0, Lvb/c0$c;->keyId_:I

    return-void
.end method

.method private i0(Lvb/i0;)V
    .locals 0

    invoke-virtual {p1}, Lvb/i0;->a()I

    move-result p1

    iput p1, p0, Lvb/c0$c;->outputPrefixType_:I

    return-void
.end method

.method private j0(Lvb/z;)V
    .locals 0

    invoke-virtual {p1}, Lvb/z;->a()I

    move-result p1

    iput p1, p0, Lvb/c0$c;->status_:I

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Lcom/google/crypto/tink/shaded/protobuf/r0$a;
    .locals 1

    invoke-super {p0}, Lcom/google/crypto/tink/shaded/protobuf/y;->U()Lcom/google/crypto/tink/shaded/protobuf/y$a;

    move-result-object v0

    return-object v0
.end method

.method public a0()Lvb/y;
    .locals 1

    iget-object v0, p0, Lvb/c0$c;->keyData_:Lvb/y;

    if-nez v0, :cond_0

    invoke-static {}, Lvb/y;->Z()Lvb/y;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public b0()I
    .locals 1

    iget v0, p0, Lvb/c0$c;->keyId_:I

    return v0
.end method

.method public c0()Lvb/i0;
    .locals 1

    iget v0, p0, Lvb/c0$c;->outputPrefixType_:I

    invoke-static {v0}, Lvb/i0;->b(I)Lvb/i0;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lvb/i0;->UNRECOGNIZED:Lvb/i0;

    :cond_0
    return-object v0
.end method

.method public bridge synthetic d()Lcom/google/crypto/tink/shaded/protobuf/r0$a;
    .locals 1

    invoke-super {p0}, Lcom/google/crypto/tink/shaded/protobuf/y;->J()Lcom/google/crypto/tink/shaded/protobuf/y$a;

    move-result-object v0

    return-object v0
.end method

.method public d0()Lvb/z;
    .locals 1

    iget v0, p0, Lvb/c0$c;->status_:I

    invoke-static {v0}, Lvb/z;->b(I)Lvb/z;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lvb/z;->UNRECOGNIZED:Lvb/z;

    :cond_0
    return-object v0
.end method

.method public bridge synthetic e()Lcom/google/crypto/tink/shaded/protobuf/r0;
    .locals 1

    invoke-super {p0}, Lcom/google/crypto/tink/shaded/protobuf/y;->A()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object v0

    return-object v0
.end method

.method public e0()Z
    .locals 1

    iget-object v0, p0, Lvb/c0$c;->keyData_:Lvb/y;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method protected final x(Lcom/google/crypto/tink/shaded/protobuf/y$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object p2, Lvb/c0$a;->a:[I

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
    sget-object p1, Lvb/c0$c;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/z0;

    if-nez p1, :cond_1

    const-class p2, Lvb/c0$c;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lvb/c0$c;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/z0;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/y$b;

    sget-object p3, Lvb/c0$c;->DEFAULT_INSTANCE:Lvb/c0$c;

    invoke-direct {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/y$b;-><init>(Lcom/google/crypto/tink/shaded/protobuf/y;)V

    sput-object p1, Lvb/c0$c;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/z0;

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
    sget-object p1, Lvb/c0$c;->DEFAULT_INSTANCE:Lvb/c0$c;

    return-object p1

    :pswitch_4
    const/4 p1, 0x4

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "keyData_"

    aput-object v0, p1, p3

    const-string p3, "status_"

    aput-object p3, p1, p2

    const/4 p2, 0x2

    const-string p3, "keyId_"

    aput-object p3, p1, p2

    const/4 p2, 0x3

    const-string p3, "outputPrefixType_"

    aput-object p3, p1, p2

    const-string p2, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\u000c\u0003\u000b\u0004\u000c"

    sget-object p3, Lvb/c0$c;->DEFAULT_INSTANCE:Lvb/c0$c;

    invoke-static {p3, p2, p1}, Lcom/google/crypto/tink/shaded/protobuf/y;->K(Lcom/google/crypto/tink/shaded/protobuf/r0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lvb/c0$c$a;

    invoke-direct {p1, p3}, Lvb/c0$c$a;-><init>(Lvb/c0$a;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lvb/c0$c;

    invoke-direct {p1}, Lvb/c0$c;-><init>()V

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
