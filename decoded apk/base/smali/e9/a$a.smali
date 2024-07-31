.class public final enum Le9/a$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le9/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Le9/a$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum NOT_READY:Le9/a$a;

.field public static final enum READY:Le9/a$a;

.field private static final synthetic zza:[Le9/a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Le9/a$a;

    const-string v1, "NOT_READY"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Le9/a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Le9/a$a;->NOT_READY:Le9/a$a;

    new-instance v1, Le9/a$a;

    const-string v3, "READY"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Le9/a$a;-><init>(Ljava/lang/String;I)V

    sput-object v1, Le9/a$a;->READY:Le9/a$a;

    const/4 v3, 0x2

    new-array v3, v3, [Le9/a$a;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    sput-object v3, Le9/a$a;->zza:[Le9/a$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Le9/a$a;
    .locals 1

    const-class v0, Le9/a$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Le9/a$a;

    return-object p0
.end method

.method public static values()[Le9/a$a;
    .locals 1

    sget-object v0, Le9/a$a;->zza:[Le9/a$a;

    invoke-virtual {v0}, [Le9/a$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Le9/a$a;

    return-object v0
.end method
