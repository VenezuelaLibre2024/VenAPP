.class final enum Lwg/m$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lwg/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lwg/m$a;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lwg/m$a;

.field public static final enum ALPHA:Lwg/m$a;

.field public static final enum ISO_IEC_646:Lwg/m$a;

.field public static final enum NUMERIC:Lwg/m$a;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lwg/m$a;

    const-string v1, "NUMERIC"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lwg/m$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lwg/m$a;->NUMERIC:Lwg/m$a;

    new-instance v1, Lwg/m$a;

    const-string v3, "ALPHA"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lwg/m$a;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lwg/m$a;->ALPHA:Lwg/m$a;

    new-instance v3, Lwg/m$a;

    const-string v5, "ISO_IEC_646"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lwg/m$a;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lwg/m$a;->ISO_IEC_646:Lwg/m$a;

    const/4 v5, 0x3

    new-array v5, v5, [Lwg/m$a;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, Lwg/m$a;->$VALUES:[Lwg/m$a;

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

.method public static valueOf(Ljava/lang/String;)Lwg/m$a;
    .locals 1

    const-class v0, Lwg/m$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lwg/m$a;

    return-object p0
.end method

.method public static values()[Lwg/m$a;
    .locals 1

    sget-object v0, Lwg/m$a;->$VALUES:[Lwg/m$a;

    invoke-virtual {v0}, [Lwg/m$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lwg/m$a;

    return-object v0
.end method
