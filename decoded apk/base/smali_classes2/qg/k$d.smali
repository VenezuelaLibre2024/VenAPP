.class final enum Lqg/k$d;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqg/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lqg/k$d;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lqg/k$d;

.field public static final enum ASCII:Lqg/k$d;

.field public static final enum B256:Lqg/k$d;

.field public static final enum C40:Lqg/k$d;

.field public static final enum EDF:Lqg/k$d;

.field public static final enum TEXT:Lqg/k$d;

.field public static final enum X12:Lqg/k$d;


# direct methods
.method static constructor <clinit>()V
    .locals 13

    new-instance v0, Lqg/k$d;

    const-string v1, "ASCII"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lqg/k$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lqg/k$d;->ASCII:Lqg/k$d;

    new-instance v1, Lqg/k$d;

    const-string v3, "C40"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lqg/k$d;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lqg/k$d;->C40:Lqg/k$d;

    new-instance v3, Lqg/k$d;

    const-string v5, "TEXT"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lqg/k$d;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lqg/k$d;->TEXT:Lqg/k$d;

    new-instance v5, Lqg/k$d;

    const-string v7, "X12"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lqg/k$d;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lqg/k$d;->X12:Lqg/k$d;

    new-instance v7, Lqg/k$d;

    const-string v9, "EDF"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, Lqg/k$d;-><init>(Ljava/lang/String;I)V

    sput-object v7, Lqg/k$d;->EDF:Lqg/k$d;

    new-instance v9, Lqg/k$d;

    const-string v11, "B256"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12}, Lqg/k$d;-><init>(Ljava/lang/String;I)V

    sput-object v9, Lqg/k$d;->B256:Lqg/k$d;

    const/4 v11, 0x6

    new-array v11, v11, [Lqg/k$d;

    aput-object v0, v11, v2

    aput-object v1, v11, v4

    aput-object v3, v11, v6

    aput-object v5, v11, v8

    aput-object v7, v11, v10

    aput-object v9, v11, v12

    sput-object v11, Lqg/k$d;->$VALUES:[Lqg/k$d;

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

.method public static valueOf(Ljava/lang/String;)Lqg/k$d;
    .locals 1

    const-class v0, Lqg/k$d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lqg/k$d;

    return-object p0
.end method

.method public static values()[Lqg/k$d;
    .locals 1

    sget-object v0, Lqg/k$d;->$VALUES:[Lqg/k$d;

    invoke-virtual {v0}, [Lqg/k$d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lqg/k$d;

    return-object v0
.end method
