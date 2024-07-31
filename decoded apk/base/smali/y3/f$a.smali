.class public final enum Ly3/f$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly3/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ly3/f$a;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Ly3/f$a;

.field public static final enum CLEARED:Ly3/f$a;

.field public static final enum FAILED:Ly3/f$a;

.field public static final enum PAUSED:Ly3/f$a;

.field public static final enum RUNNING:Ly3/f$a;

.field public static final enum SUCCESS:Ly3/f$a;


# instance fields
.field private final isComplete:Z


# direct methods
.method static constructor <clinit>()V
    .locals 11

    new-instance v0, Ly3/f$a;

    const-string v1, "RUNNING"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Ly3/f$a;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Ly3/f$a;->RUNNING:Ly3/f$a;

    new-instance v1, Ly3/f$a;

    const-string v3, "PAUSED"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v2}, Ly3/f$a;-><init>(Ljava/lang/String;IZ)V

    sput-object v1, Ly3/f$a;->PAUSED:Ly3/f$a;

    new-instance v3, Ly3/f$a;

    const-string v5, "CLEARED"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v2}, Ly3/f$a;-><init>(Ljava/lang/String;IZ)V

    sput-object v3, Ly3/f$a;->CLEARED:Ly3/f$a;

    new-instance v5, Ly3/f$a;

    const-string v7, "SUCCESS"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8, v4}, Ly3/f$a;-><init>(Ljava/lang/String;IZ)V

    sput-object v5, Ly3/f$a;->SUCCESS:Ly3/f$a;

    new-instance v7, Ly3/f$a;

    const-string v9, "FAILED"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10, v4}, Ly3/f$a;-><init>(Ljava/lang/String;IZ)V

    sput-object v7, Ly3/f$a;->FAILED:Ly3/f$a;

    const/4 v9, 0x5

    new-array v9, v9, [Ly3/f$a;

    aput-object v0, v9, v2

    aput-object v1, v9, v4

    aput-object v3, v9, v6

    aput-object v5, v9, v8

    aput-object v7, v9, v10

    sput-object v9, Ly3/f$a;->$VALUES:[Ly3/f$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-boolean p3, p0, Ly3/f$a;->isComplete:Z

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ly3/f$a;
    .locals 1

    const-class v0, Ly3/f$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ly3/f$a;

    return-object p0
.end method

.method public static values()[Ly3/f$a;
    .locals 1

    sget-object v0, Ly3/f$a;->$VALUES:[Ly3/f$a;

    invoke-virtual {v0}, [Ly3/f$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ly3/f$a;

    return-object v0
.end method


# virtual methods
.method b()Z
    .locals 1

    iget-boolean v0, p0, Ly3/f$a;->isComplete:Z

    return v0
.end method
