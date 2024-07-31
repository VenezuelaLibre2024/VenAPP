.class final enum Log/c$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Log/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Log/c$b;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Log/c$b;

.field public static final enum ANSIX12_ENCODE:Log/c$b;

.field public static final enum ASCII_ENCODE:Log/c$b;

.field public static final enum BASE256_ENCODE:Log/c$b;

.field public static final enum C40_ENCODE:Log/c$b;

.field public static final enum ECI_ENCODE:Log/c$b;

.field public static final enum EDIFACT_ENCODE:Log/c$b;

.field public static final enum PAD_ENCODE:Log/c$b;

.field public static final enum TEXT_ENCODE:Log/c$b;


# direct methods
.method static constructor <clinit>()V
    .locals 16

    new-instance v0, Log/c$b;

    const-string v1, "PAD_ENCODE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Log/c$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Log/c$b;->PAD_ENCODE:Log/c$b;

    new-instance v1, Log/c$b;

    const-string v3, "ASCII_ENCODE"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Log/c$b;-><init>(Ljava/lang/String;I)V

    sput-object v1, Log/c$b;->ASCII_ENCODE:Log/c$b;

    new-instance v3, Log/c$b;

    const-string v5, "C40_ENCODE"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Log/c$b;-><init>(Ljava/lang/String;I)V

    sput-object v3, Log/c$b;->C40_ENCODE:Log/c$b;

    new-instance v5, Log/c$b;

    const-string v7, "TEXT_ENCODE"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Log/c$b;-><init>(Ljava/lang/String;I)V

    sput-object v5, Log/c$b;->TEXT_ENCODE:Log/c$b;

    new-instance v7, Log/c$b;

    const-string v9, "ANSIX12_ENCODE"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, Log/c$b;-><init>(Ljava/lang/String;I)V

    sput-object v7, Log/c$b;->ANSIX12_ENCODE:Log/c$b;

    new-instance v9, Log/c$b;

    const-string v11, "EDIFACT_ENCODE"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12}, Log/c$b;-><init>(Ljava/lang/String;I)V

    sput-object v9, Log/c$b;->EDIFACT_ENCODE:Log/c$b;

    new-instance v11, Log/c$b;

    const-string v13, "BASE256_ENCODE"

    const/4 v14, 0x6

    invoke-direct {v11, v13, v14}, Log/c$b;-><init>(Ljava/lang/String;I)V

    sput-object v11, Log/c$b;->BASE256_ENCODE:Log/c$b;

    new-instance v13, Log/c$b;

    const-string v15, "ECI_ENCODE"

    const/4 v14, 0x7

    invoke-direct {v13, v15, v14}, Log/c$b;-><init>(Ljava/lang/String;I)V

    sput-object v13, Log/c$b;->ECI_ENCODE:Log/c$b;

    const/16 v15, 0x8

    new-array v15, v15, [Log/c$b;

    aput-object v0, v15, v2

    aput-object v1, v15, v4

    aput-object v3, v15, v6

    aput-object v5, v15, v8

    aput-object v7, v15, v10

    aput-object v9, v15, v12

    const/4 v0, 0x6

    aput-object v11, v15, v0

    aput-object v13, v15, v14

    sput-object v15, Log/c$b;->$VALUES:[Log/c$b;

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

.method public static valueOf(Ljava/lang/String;)Log/c$b;
    .locals 1

    const-class v0, Log/c$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Log/c$b;

    return-object p0
.end method

.method public static values()[Log/c$b;
    .locals 1

    sget-object v0, Log/c$b;->$VALUES:[Log/c$b;

    invoke-virtual {v0}, [Log/c$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Log/c$b;

    return-object v0
.end method
