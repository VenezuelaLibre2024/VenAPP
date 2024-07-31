.class final enum Lwi/j$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lwi/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lwi/j$b;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lwi/j$b;

.field public static final enum ENABLE_PUSH:Lwi/j$b;

.field public static final enum HEADER_TABLE_SIZE:Lwi/j$b;

.field public static final enum INITIAL_WINDOW_SIZE:Lwi/j$b;

.field public static final enum MAX_CONCURRENT_STREAMS:Lwi/j$b;

.field public static final enum MAX_FRAME_SIZE:Lwi/j$b;

.field public static final enum MAX_HEADER_LIST_SIZE:Lwi/j$b;


# instance fields
.field private final bit:I


# direct methods
.method static constructor <clinit>()V
    .locals 15

    new-instance v0, Lwi/j$b;

    const-string v1, "HEADER_TABLE_SIZE"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lwi/j$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lwi/j$b;->HEADER_TABLE_SIZE:Lwi/j$b;

    new-instance v1, Lwi/j$b;

    const-string v4, "ENABLE_PUSH"

    const/4 v5, 0x2

    invoke-direct {v1, v4, v3, v5}, Lwi/j$b;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lwi/j$b;->ENABLE_PUSH:Lwi/j$b;

    new-instance v4, Lwi/j$b;

    const-string v6, "MAX_CONCURRENT_STREAMS"

    const/4 v7, 0x4

    invoke-direct {v4, v6, v5, v7}, Lwi/j$b;-><init>(Ljava/lang/String;II)V

    sput-object v4, Lwi/j$b;->MAX_CONCURRENT_STREAMS:Lwi/j$b;

    new-instance v6, Lwi/j$b;

    const-string v8, "MAX_FRAME_SIZE"

    const/4 v9, 0x3

    const/4 v10, 0x5

    invoke-direct {v6, v8, v9, v10}, Lwi/j$b;-><init>(Ljava/lang/String;II)V

    sput-object v6, Lwi/j$b;->MAX_FRAME_SIZE:Lwi/j$b;

    new-instance v8, Lwi/j$b;

    const-string v11, "MAX_HEADER_LIST_SIZE"

    const/4 v12, 0x6

    invoke-direct {v8, v11, v7, v12}, Lwi/j$b;-><init>(Ljava/lang/String;II)V

    sput-object v8, Lwi/j$b;->MAX_HEADER_LIST_SIZE:Lwi/j$b;

    new-instance v11, Lwi/j$b;

    const-string v13, "INITIAL_WINDOW_SIZE"

    const/4 v14, 0x7

    invoke-direct {v11, v13, v10, v14}, Lwi/j$b;-><init>(Ljava/lang/String;II)V

    sput-object v11, Lwi/j$b;->INITIAL_WINDOW_SIZE:Lwi/j$b;

    new-array v12, v12, [Lwi/j$b;

    aput-object v0, v12, v2

    aput-object v1, v12, v3

    aput-object v4, v12, v5

    aput-object v6, v12, v9

    aput-object v8, v12, v7

    aput-object v11, v12, v10

    sput-object v12, Lwi/j$b;->$VALUES:[Lwi/j$b;

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

    iput p3, p0, Lwi/j$b;->bit:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lwi/j$b;
    .locals 1

    const-class v0, Lwi/j$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lwi/j$b;

    return-object p0
.end method

.method public static values()[Lwi/j$b;
    .locals 1

    sget-object v0, Lwi/j$b;->$VALUES:[Lwi/j$b;

    invoke-virtual {v0}, [Lwi/j$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lwi/j$b;

    return-object v0
.end method


# virtual methods
.method public b()I
    .locals 1

    iget v0, p0, Lwi/j$b;->bit:I

    return v0
.end method
