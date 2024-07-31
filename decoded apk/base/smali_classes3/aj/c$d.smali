.class final enum Laj/c$d;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Laj/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Laj/c$d;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Laj/c$d;

.field public static final enum ASYNC:Laj/c$d;

.field public static final enum BLOCKING:Laj/c$d;

.field public static final enum FUTURE:Laj/c$d;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Laj/c$d;

    const-string v1, "BLOCKING"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Laj/c$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Laj/c$d;->BLOCKING:Laj/c$d;

    new-instance v1, Laj/c$d;

    const-string v3, "FUTURE"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Laj/c$d;-><init>(Ljava/lang/String;I)V

    sput-object v1, Laj/c$d;->FUTURE:Laj/c$d;

    new-instance v3, Laj/c$d;

    const-string v5, "ASYNC"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Laj/c$d;-><init>(Ljava/lang/String;I)V

    sput-object v3, Laj/c$d;->ASYNC:Laj/c$d;

    const/4 v5, 0x3

    new-array v5, v5, [Laj/c$d;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, Laj/c$d;->$VALUES:[Laj/c$d;

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

.method public static valueOf(Ljava/lang/String;)Laj/c$d;
    .locals 1

    const-class v0, Laj/c$d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Laj/c$d;

    return-object p0
.end method

.method public static values()[Laj/c$d;
    .locals 1

    sget-object v0, Laj/c$d;->$VALUES:[Laj/c$d;

    invoke-virtual {v0}, [Laj/c$d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Laj/c$d;

    return-object v0
.end method
