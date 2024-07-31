.class public final enum Lod/j$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lod/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lod/j$a;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lod/j$a;

.field public static final enum COMBINED:Lod/j$a;

.field public static final enum GLOBAL:Lod/j$a;

.field public static final enum NONE:Lod/j$a;

.field public static final enum SDK:Lod/j$a;


# instance fields
.field private final code:I


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lod/j$a;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lod/j$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lod/j$a;->NONE:Lod/j$a;

    new-instance v1, Lod/j$a;

    const-string v3, "SDK"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, Lod/j$a;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lod/j$a;->SDK:Lod/j$a;

    new-instance v3, Lod/j$a;

    const-string v5, "GLOBAL"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6}, Lod/j$a;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lod/j$a;->GLOBAL:Lod/j$a;

    new-instance v5, Lod/j$a;

    const-string v7, "COMBINED"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8, v8}, Lod/j$a;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lod/j$a;->COMBINED:Lod/j$a;

    const/4 v7, 0x4

    new-array v7, v7, [Lod/j$a;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    sput-object v7, Lod/j$a;->$VALUES:[Lod/j$a;

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

    iput p3, p0, Lod/j$a;->code:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lod/j$a;
    .locals 1

    const-class v0, Lod/j$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lod/j$a;

    return-object p0
.end method

.method public static values()[Lod/j$a;
    .locals 1

    sget-object v0, Lod/j$a;->$VALUES:[Lod/j$a;

    invoke-virtual {v0}, [Lod/j$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lod/j$a;

    return-object v0
.end method


# virtual methods
.method public b()I
    .locals 1

    iget v0, p0, Lod/j$a;->code:I

    return v0
.end method
