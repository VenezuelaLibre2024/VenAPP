.class public final enum Lqd/t$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqd/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lqd/t$b;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lqd/t$b;

.field public static final enum IMAGE_DISPLAY_ERROR:Lqd/t$b;

.field public static final enum IMAGE_FETCH_ERROR:Lqd/t$b;

.field public static final enum IMAGE_UNSUPPORTED_FORMAT:Lqd/t$b;

.field public static final enum UNSPECIFIED_RENDER_ERROR:Lqd/t$b;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lqd/t$b;

    const-string v1, "UNSPECIFIED_RENDER_ERROR"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lqd/t$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lqd/t$b;->UNSPECIFIED_RENDER_ERROR:Lqd/t$b;

    new-instance v1, Lqd/t$b;

    const-string v3, "IMAGE_FETCH_ERROR"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lqd/t$b;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lqd/t$b;->IMAGE_FETCH_ERROR:Lqd/t$b;

    new-instance v3, Lqd/t$b;

    const-string v5, "IMAGE_DISPLAY_ERROR"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lqd/t$b;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lqd/t$b;->IMAGE_DISPLAY_ERROR:Lqd/t$b;

    new-instance v5, Lqd/t$b;

    const-string v7, "IMAGE_UNSUPPORTED_FORMAT"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lqd/t$b;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lqd/t$b;->IMAGE_UNSUPPORTED_FORMAT:Lqd/t$b;

    const/4 v7, 0x4

    new-array v7, v7, [Lqd/t$b;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    sput-object v7, Lqd/t$b;->$VALUES:[Lqd/t$b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lqd/t$b;
    .locals 1

    const-class v0, Lqd/t$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lqd/t$b;

    return-object p0
.end method

.method public static values()[Lqd/t$b;
    .locals 1

    sget-object v0, Lqd/t$b;->$VALUES:[Lqd/t$b;

    invoke-virtual {v0}, [Lqd/t$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lqd/t$b;

    return-object v0
.end method
