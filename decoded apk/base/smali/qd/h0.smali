.class public final enum Lqd/h0;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/z$c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqd/h0$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lqd/h0;",
        ">;",
        "Lcom/google/protobuf/z$c;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lqd/h0;

.field public static final enum IMAGE_DISPLAY_ERROR:Lqd/h0;

.field public static final IMAGE_DISPLAY_ERROR_VALUE:I = 0x2

.field public static final enum IMAGE_FETCH_ERROR:Lqd/h0;

.field public static final IMAGE_FETCH_ERROR_VALUE:I = 0x1

.field public static final enum IMAGE_UNSUPPORTED_FORMAT:Lqd/h0;

.field public static final IMAGE_UNSUPPORTED_FORMAT_VALUE:I = 0x3

.field public static final enum UNSPECIFIED_RENDER_ERROR:Lqd/h0;

.field public static final UNSPECIFIED_RENDER_ERROR_VALUE:I

.field private static final internalValueMap:Lcom/google/protobuf/z$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/z$d<",
            "Lqd/h0;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final value:I


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lqd/h0;

    const-string v1, "UNSPECIFIED_RENDER_ERROR"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lqd/h0;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lqd/h0;->UNSPECIFIED_RENDER_ERROR:Lqd/h0;

    new-instance v1, Lqd/h0;

    const-string v3, "IMAGE_FETCH_ERROR"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, Lqd/h0;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lqd/h0;->IMAGE_FETCH_ERROR:Lqd/h0;

    new-instance v3, Lqd/h0;

    const-string v5, "IMAGE_DISPLAY_ERROR"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6}, Lqd/h0;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lqd/h0;->IMAGE_DISPLAY_ERROR:Lqd/h0;

    new-instance v5, Lqd/h0;

    const-string v7, "IMAGE_UNSUPPORTED_FORMAT"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8, v8}, Lqd/h0;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lqd/h0;->IMAGE_UNSUPPORTED_FORMAT:Lqd/h0;

    const/4 v7, 0x4

    new-array v7, v7, [Lqd/h0;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    sput-object v7, Lqd/h0;->$VALUES:[Lqd/h0;

    new-instance v0, Lqd/h0$a;

    invoke-direct {v0}, Lqd/h0$a;-><init>()V

    sput-object v0, Lqd/h0;->internalValueMap:Lcom/google/protobuf/z$d;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lqd/h0;->value:I

    return-void
.end method

.method public static b(I)Lqd/h0;
    .locals 1

    if-eqz p0, :cond_3

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget-object p0, Lqd/h0;->IMAGE_UNSUPPORTED_FORMAT:Lqd/h0;

    return-object p0

    :cond_1
    sget-object p0, Lqd/h0;->IMAGE_DISPLAY_ERROR:Lqd/h0;

    return-object p0

    :cond_2
    sget-object p0, Lqd/h0;->IMAGE_FETCH_ERROR:Lqd/h0;

    return-object p0

    :cond_3
    sget-object p0, Lqd/h0;->UNSPECIFIED_RENDER_ERROR:Lqd/h0;

    return-object p0
.end method

.method public static h()Lcom/google/protobuf/z$e;
    .locals 1

    sget-object v0, Lqd/h0$b;->a:Lcom/google/protobuf/z$e;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lqd/h0;
    .locals 1

    const-class v0, Lqd/h0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lqd/h0;

    return-object p0
.end method

.method public static values()[Lqd/h0;
    .locals 1

    sget-object v0, Lqd/h0;->$VALUES:[Lqd/h0;

    invoke-virtual {v0}, [Lqd/h0;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lqd/h0;

    return-object v0
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lqd/h0;->value:I

    return v0
.end method
