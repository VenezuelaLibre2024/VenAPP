.class public final enum Lk0/i$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk0/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lk0/i$a;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lk0/i$a;

.field public static final enum CONSTANT:Lk0/i$a;

.field public static final enum ERROR:Lk0/i$a;

.field public static final enum SLACK:Lk0/i$a;

.field public static final enum UNKNOWN:Lk0/i$a;

.field public static final enum UNRESTRICTED:Lk0/i$a;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    new-instance v0, Lk0/i$a;

    const-string v1, "UNRESTRICTED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lk0/i$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lk0/i$a;->UNRESTRICTED:Lk0/i$a;

    new-instance v1, Lk0/i$a;

    const-string v3, "CONSTANT"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lk0/i$a;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lk0/i$a;->CONSTANT:Lk0/i$a;

    new-instance v3, Lk0/i$a;

    const-string v5, "SLACK"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lk0/i$a;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lk0/i$a;->SLACK:Lk0/i$a;

    new-instance v5, Lk0/i$a;

    const-string v7, "ERROR"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lk0/i$a;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lk0/i$a;->ERROR:Lk0/i$a;

    new-instance v7, Lk0/i$a;

    const-string v9, "UNKNOWN"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, Lk0/i$a;-><init>(Ljava/lang/String;I)V

    sput-object v7, Lk0/i$a;->UNKNOWN:Lk0/i$a;

    const/4 v9, 0x5

    new-array v9, v9, [Lk0/i$a;

    aput-object v0, v9, v2

    aput-object v1, v9, v4

    aput-object v3, v9, v6

    aput-object v5, v9, v8

    aput-object v7, v9, v10

    sput-object v9, Lk0/i$a;->$VALUES:[Lk0/i$a;

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

.method public static valueOf(Ljava/lang/String;)Lk0/i$a;
    .locals 1

    const-class v0, Lk0/i$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lk0/i$a;

    return-object p0
.end method

.method public static values()[Lk0/i$a;
    .locals 1

    sget-object v0, Lk0/i$a;->$VALUES:[Lk0/i$a;

    invoke-virtual {v0}, [Lk0/i$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lk0/i$a;

    return-object v0
.end method
