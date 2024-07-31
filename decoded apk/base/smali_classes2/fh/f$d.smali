.class final enum Lfh/f$d;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lfh/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lfh/f$d;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lfh/f$d;

.field public static final enum LARGE:Lfh/f$d;

.field public static final enum MEDIUM:Lfh/f$d;

.field public static final enum SMALL:Lfh/f$d;


# instance fields
.field private final description:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lfh/f$d;

    const-string v1, "version 1-9"

    const-string v2, "SMALL"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, Lfh/f$d;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lfh/f$d;->SMALL:Lfh/f$d;

    new-instance v1, Lfh/f$d;

    const-string v2, "version 10-26"

    const-string v4, "MEDIUM"

    const/4 v5, 0x1

    invoke-direct {v1, v4, v5, v2}, Lfh/f$d;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lfh/f$d;->MEDIUM:Lfh/f$d;

    new-instance v2, Lfh/f$d;

    const-string v4, "version 27-40"

    const-string v6, "LARGE"

    const/4 v7, 0x2

    invoke-direct {v2, v6, v7, v4}, Lfh/f$d;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, Lfh/f$d;->LARGE:Lfh/f$d;

    const/4 v4, 0x3

    new-array v4, v4, [Lfh/f$d;

    aput-object v0, v4, v3

    aput-object v1, v4, v5

    aput-object v2, v4, v7

    sput-object v4, Lfh/f$d;->$VALUES:[Lfh/f$d;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lfh/f$d;->description:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lfh/f$d;
    .locals 1

    const-class v0, Lfh/f$d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lfh/f$d;

    return-object p0
.end method

.method public static values()[Lfh/f$d;
    .locals 1

    sget-object v0, Lfh/f$d;->$VALUES:[Lfh/f$d;

    invoke-virtual {v0}, [Lfh/f$d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lfh/f$d;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lfh/f$d;->description:Ljava/lang/String;

    return-object v0
.end method
