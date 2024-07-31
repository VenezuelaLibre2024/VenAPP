.class public final enum Landroidx/constraintlayout/widget/b$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/constraintlayout/widget/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Landroidx/constraintlayout/widget/b$b;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Landroidx/constraintlayout/widget/b$b;

.field public static final enum BOOLEAN_TYPE:Landroidx/constraintlayout/widget/b$b;

.field public static final enum COLOR_DRAWABLE_TYPE:Landroidx/constraintlayout/widget/b$b;

.field public static final enum COLOR_TYPE:Landroidx/constraintlayout/widget/b$b;

.field public static final enum DIMENSION_TYPE:Landroidx/constraintlayout/widget/b$b;

.field public static final enum FLOAT_TYPE:Landroidx/constraintlayout/widget/b$b;

.field public static final enum INT_TYPE:Landroidx/constraintlayout/widget/b$b;

.field public static final enum REFERENCE_TYPE:Landroidx/constraintlayout/widget/b$b;

.field public static final enum STRING_TYPE:Landroidx/constraintlayout/widget/b$b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Landroidx/constraintlayout/widget/b$b;

    const-string v1, "INT_TYPE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Landroidx/constraintlayout/widget/b$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/constraintlayout/widget/b$b;->INT_TYPE:Landroidx/constraintlayout/widget/b$b;

    new-instance v0, Landroidx/constraintlayout/widget/b$b;

    const-string v1, "FLOAT_TYPE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Landroidx/constraintlayout/widget/b$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/constraintlayout/widget/b$b;->FLOAT_TYPE:Landroidx/constraintlayout/widget/b$b;

    new-instance v0, Landroidx/constraintlayout/widget/b$b;

    const-string v1, "COLOR_TYPE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Landroidx/constraintlayout/widget/b$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/constraintlayout/widget/b$b;->COLOR_TYPE:Landroidx/constraintlayout/widget/b$b;

    new-instance v0, Landroidx/constraintlayout/widget/b$b;

    const-string v1, "COLOR_DRAWABLE_TYPE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Landroidx/constraintlayout/widget/b$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/constraintlayout/widget/b$b;->COLOR_DRAWABLE_TYPE:Landroidx/constraintlayout/widget/b$b;

    new-instance v0, Landroidx/constraintlayout/widget/b$b;

    const-string v1, "STRING_TYPE"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Landroidx/constraintlayout/widget/b$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/constraintlayout/widget/b$b;->STRING_TYPE:Landroidx/constraintlayout/widget/b$b;

    new-instance v0, Landroidx/constraintlayout/widget/b$b;

    const-string v1, "BOOLEAN_TYPE"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Landroidx/constraintlayout/widget/b$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/constraintlayout/widget/b$b;->BOOLEAN_TYPE:Landroidx/constraintlayout/widget/b$b;

    new-instance v0, Landroidx/constraintlayout/widget/b$b;

    const-string v1, "DIMENSION_TYPE"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Landroidx/constraintlayout/widget/b$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/constraintlayout/widget/b$b;->DIMENSION_TYPE:Landroidx/constraintlayout/widget/b$b;

    new-instance v0, Landroidx/constraintlayout/widget/b$b;

    const-string v1, "REFERENCE_TYPE"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Landroidx/constraintlayout/widget/b$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/constraintlayout/widget/b$b;->REFERENCE_TYPE:Landroidx/constraintlayout/widget/b$b;

    invoke-static {}, Landroidx/constraintlayout/widget/b$b;->b()[Landroidx/constraintlayout/widget/b$b;

    move-result-object v0

    sput-object v0, Landroidx/constraintlayout/widget/b$b;->$VALUES:[Landroidx/constraintlayout/widget/b$b;

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

.method private static synthetic b()[Landroidx/constraintlayout/widget/b$b;
    .locals 3

    const/16 v0, 0x8

    new-array v0, v0, [Landroidx/constraintlayout/widget/b$b;

    const/4 v1, 0x0

    sget-object v2, Landroidx/constraintlayout/widget/b$b;->INT_TYPE:Landroidx/constraintlayout/widget/b$b;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Landroidx/constraintlayout/widget/b$b;->FLOAT_TYPE:Landroidx/constraintlayout/widget/b$b;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Landroidx/constraintlayout/widget/b$b;->COLOR_TYPE:Landroidx/constraintlayout/widget/b$b;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Landroidx/constraintlayout/widget/b$b;->COLOR_DRAWABLE_TYPE:Landroidx/constraintlayout/widget/b$b;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Landroidx/constraintlayout/widget/b$b;->STRING_TYPE:Landroidx/constraintlayout/widget/b$b;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Landroidx/constraintlayout/widget/b$b;->BOOLEAN_TYPE:Landroidx/constraintlayout/widget/b$b;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Landroidx/constraintlayout/widget/b$b;->DIMENSION_TYPE:Landroidx/constraintlayout/widget/b$b;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Landroidx/constraintlayout/widget/b$b;->REFERENCE_TYPE:Landroidx/constraintlayout/widget/b$b;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Landroidx/constraintlayout/widget/b$b;
    .locals 1

    const-class v0, Landroidx/constraintlayout/widget/b$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Landroidx/constraintlayout/widget/b$b;

    return-object p0
.end method

.method public static values()[Landroidx/constraintlayout/widget/b$b;
    .locals 1

    sget-object v0, Landroidx/constraintlayout/widget/b$b;->$VALUES:[Landroidx/constraintlayout/widget/b$b;

    invoke-virtual {v0}, [Landroidx/constraintlayout/widget/b$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroidx/constraintlayout/widget/b$b;

    return-object v0
.end method
