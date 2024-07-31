.class final enum Lio/flutter/view/AccessibilityBridge$Flag;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/view/AccessibilityBridge;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "Flag"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/flutter/view/AccessibilityBridge$Flag;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lio/flutter/view/AccessibilityBridge$Flag;

.field public static final enum HAS_CHECKED_STATE:Lio/flutter/view/AccessibilityBridge$Flag;

.field public static final enum HAS_ENABLED_STATE:Lio/flutter/view/AccessibilityBridge$Flag;

.field public static final enum HAS_IMPLICIT_SCROLLING:Lio/flutter/view/AccessibilityBridge$Flag;

.field public static final enum HAS_TOGGLED_STATE:Lio/flutter/view/AccessibilityBridge$Flag;

.field public static final enum IS_BUTTON:Lio/flutter/view/AccessibilityBridge$Flag;

.field public static final enum IS_CHECKED:Lio/flutter/view/AccessibilityBridge$Flag;

.field public static final enum IS_CHECK_STATE_MIXED:Lio/flutter/view/AccessibilityBridge$Flag;

.field public static final enum IS_ENABLED:Lio/flutter/view/AccessibilityBridge$Flag;

.field public static final enum IS_FOCUSABLE:Lio/flutter/view/AccessibilityBridge$Flag;

.field public static final enum IS_FOCUSED:Lio/flutter/view/AccessibilityBridge$Flag;

.field public static final enum IS_HEADER:Lio/flutter/view/AccessibilityBridge$Flag;

.field public static final enum IS_HIDDEN:Lio/flutter/view/AccessibilityBridge$Flag;

.field public static final enum IS_IMAGE:Lio/flutter/view/AccessibilityBridge$Flag;

.field public static final enum IS_IN_MUTUALLY_EXCLUSIVE_GROUP:Lio/flutter/view/AccessibilityBridge$Flag;

.field public static final enum IS_KEYBOARD_KEY:Lio/flutter/view/AccessibilityBridge$Flag;

.field public static final enum IS_LINK:Lio/flutter/view/AccessibilityBridge$Flag;

.field public static final enum IS_LIVE_REGION:Lio/flutter/view/AccessibilityBridge$Flag;

.field public static final enum IS_MULTILINE:Lio/flutter/view/AccessibilityBridge$Flag;

.field public static final enum IS_OBSCURED:Lio/flutter/view/AccessibilityBridge$Flag;

.field public static final enum IS_READ_ONLY:Lio/flutter/view/AccessibilityBridge$Flag;

.field public static final enum IS_SELECTED:Lio/flutter/view/AccessibilityBridge$Flag;

.field public static final enum IS_SLIDER:Lio/flutter/view/AccessibilityBridge$Flag;

.field public static final enum IS_TEXT_FIELD:Lio/flutter/view/AccessibilityBridge$Flag;

.field public static final enum IS_TOGGLED:Lio/flutter/view/AccessibilityBridge$Flag;

.field public static final enum NAMES_ROUTE:Lio/flutter/view/AccessibilityBridge$Flag;

.field public static final enum SCOPES_ROUTE:Lio/flutter/view/AccessibilityBridge$Flag;


# instance fields
.field final value:I


# direct methods
.method static constructor <clinit>()V
    .locals 29

    new-instance v0, Lio/flutter/view/AccessibilityBridge$Flag;

    const-string v1, "HAS_CHECKED_STATE"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lio/flutter/view/AccessibilityBridge$Flag;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lio/flutter/view/AccessibilityBridge$Flag;->HAS_CHECKED_STATE:Lio/flutter/view/AccessibilityBridge$Flag;

    new-instance v1, Lio/flutter/view/AccessibilityBridge$Flag;

    const-string v4, "IS_CHECKED"

    const/4 v5, 0x2

    invoke-direct {v1, v4, v3, v5}, Lio/flutter/view/AccessibilityBridge$Flag;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lio/flutter/view/AccessibilityBridge$Flag;->IS_CHECKED:Lio/flutter/view/AccessibilityBridge$Flag;

    new-instance v4, Lio/flutter/view/AccessibilityBridge$Flag;

    const-string v6, "IS_SELECTED"

    const/4 v7, 0x4

    invoke-direct {v4, v6, v5, v7}, Lio/flutter/view/AccessibilityBridge$Flag;-><init>(Ljava/lang/String;II)V

    sput-object v4, Lio/flutter/view/AccessibilityBridge$Flag;->IS_SELECTED:Lio/flutter/view/AccessibilityBridge$Flag;

    new-instance v6, Lio/flutter/view/AccessibilityBridge$Flag;

    const-string v8, "IS_BUTTON"

    const/4 v9, 0x3

    const/16 v10, 0x8

    invoke-direct {v6, v8, v9, v10}, Lio/flutter/view/AccessibilityBridge$Flag;-><init>(Ljava/lang/String;II)V

    sput-object v6, Lio/flutter/view/AccessibilityBridge$Flag;->IS_BUTTON:Lio/flutter/view/AccessibilityBridge$Flag;

    new-instance v8, Lio/flutter/view/AccessibilityBridge$Flag;

    const-string v11, "IS_TEXT_FIELD"

    const/16 v12, 0x10

    invoke-direct {v8, v11, v7, v12}, Lio/flutter/view/AccessibilityBridge$Flag;-><init>(Ljava/lang/String;II)V

    sput-object v8, Lio/flutter/view/AccessibilityBridge$Flag;->IS_TEXT_FIELD:Lio/flutter/view/AccessibilityBridge$Flag;

    new-instance v11, Lio/flutter/view/AccessibilityBridge$Flag;

    const/16 v13, 0x20

    const-string v14, "IS_FOCUSED"

    const/4 v15, 0x5

    invoke-direct {v11, v14, v15, v13}, Lio/flutter/view/AccessibilityBridge$Flag;-><init>(Ljava/lang/String;II)V

    sput-object v11, Lio/flutter/view/AccessibilityBridge$Flag;->IS_FOCUSED:Lio/flutter/view/AccessibilityBridge$Flag;

    new-instance v13, Lio/flutter/view/AccessibilityBridge$Flag;

    const/16 v14, 0x40

    const-string v15, "HAS_ENABLED_STATE"

    const/4 v7, 0x6

    invoke-direct {v13, v15, v7, v14}, Lio/flutter/view/AccessibilityBridge$Flag;-><init>(Ljava/lang/String;II)V

    sput-object v13, Lio/flutter/view/AccessibilityBridge$Flag;->HAS_ENABLED_STATE:Lio/flutter/view/AccessibilityBridge$Flag;

    new-instance v14, Lio/flutter/view/AccessibilityBridge$Flag;

    const/16 v15, 0x80

    const-string v7, "IS_ENABLED"

    const/4 v9, 0x7

    invoke-direct {v14, v7, v9, v15}, Lio/flutter/view/AccessibilityBridge$Flag;-><init>(Ljava/lang/String;II)V

    sput-object v14, Lio/flutter/view/AccessibilityBridge$Flag;->IS_ENABLED:Lio/flutter/view/AccessibilityBridge$Flag;

    new-instance v7, Lio/flutter/view/AccessibilityBridge$Flag;

    const-string v15, "IS_IN_MUTUALLY_EXCLUSIVE_GROUP"

    const/16 v9, 0x100

    invoke-direct {v7, v15, v10, v9}, Lio/flutter/view/AccessibilityBridge$Flag;-><init>(Ljava/lang/String;II)V

    sput-object v7, Lio/flutter/view/AccessibilityBridge$Flag;->IS_IN_MUTUALLY_EXCLUSIVE_GROUP:Lio/flutter/view/AccessibilityBridge$Flag;

    new-instance v9, Lio/flutter/view/AccessibilityBridge$Flag;

    const/16 v15, 0x200

    const-string v10, "IS_HEADER"

    const/16 v5, 0x9

    invoke-direct {v9, v10, v5, v15}, Lio/flutter/view/AccessibilityBridge$Flag;-><init>(Ljava/lang/String;II)V

    sput-object v9, Lio/flutter/view/AccessibilityBridge$Flag;->IS_HEADER:Lio/flutter/view/AccessibilityBridge$Flag;

    new-instance v10, Lio/flutter/view/AccessibilityBridge$Flag;

    const/16 v15, 0x400

    const-string v5, "IS_OBSCURED"

    const/16 v3, 0xa

    invoke-direct {v10, v5, v3, v15}, Lio/flutter/view/AccessibilityBridge$Flag;-><init>(Ljava/lang/String;II)V

    sput-object v10, Lio/flutter/view/AccessibilityBridge$Flag;->IS_OBSCURED:Lio/flutter/view/AccessibilityBridge$Flag;

    new-instance v5, Lio/flutter/view/AccessibilityBridge$Flag;

    const/16 v15, 0x800

    const-string v3, "SCOPES_ROUTE"

    const/16 v2, 0xb

    invoke-direct {v5, v3, v2, v15}, Lio/flutter/view/AccessibilityBridge$Flag;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lio/flutter/view/AccessibilityBridge$Flag;->SCOPES_ROUTE:Lio/flutter/view/AccessibilityBridge$Flag;

    new-instance v3, Lio/flutter/view/AccessibilityBridge$Flag;

    const/16 v15, 0x1000

    const-string v2, "NAMES_ROUTE"

    const/16 v12, 0xc

    invoke-direct {v3, v2, v12, v15}, Lio/flutter/view/AccessibilityBridge$Flag;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lio/flutter/view/AccessibilityBridge$Flag;->NAMES_ROUTE:Lio/flutter/view/AccessibilityBridge$Flag;

    new-instance v2, Lio/flutter/view/AccessibilityBridge$Flag;

    const/16 v15, 0x2000

    const-string v12, "IS_HIDDEN"

    move-object/from16 v16, v3

    const/16 v3, 0xd

    invoke-direct {v2, v12, v3, v15}, Lio/flutter/view/AccessibilityBridge$Flag;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lio/flutter/view/AccessibilityBridge$Flag;->IS_HIDDEN:Lio/flutter/view/AccessibilityBridge$Flag;

    new-instance v12, Lio/flutter/view/AccessibilityBridge$Flag;

    const/16 v15, 0x4000

    const-string v3, "IS_IMAGE"

    move-object/from16 v17, v2

    const/16 v2, 0xe

    invoke-direct {v12, v3, v2, v15}, Lio/flutter/view/AccessibilityBridge$Flag;-><init>(Ljava/lang/String;II)V

    sput-object v12, Lio/flutter/view/AccessibilityBridge$Flag;->IS_IMAGE:Lio/flutter/view/AccessibilityBridge$Flag;

    new-instance v3, Lio/flutter/view/AccessibilityBridge$Flag;

    const v15, 0x8000

    const-string v2, "IS_LIVE_REGION"

    move-object/from16 v18, v12

    const/16 v12, 0xf

    invoke-direct {v3, v2, v12, v15}, Lio/flutter/view/AccessibilityBridge$Flag;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lio/flutter/view/AccessibilityBridge$Flag;->IS_LIVE_REGION:Lio/flutter/view/AccessibilityBridge$Flag;

    new-instance v2, Lio/flutter/view/AccessibilityBridge$Flag;

    const-string v15, "HAS_TOGGLED_STATE"

    const/high16 v12, 0x10000

    move-object/from16 v19, v3

    const/16 v3, 0x10

    invoke-direct {v2, v15, v3, v12}, Lio/flutter/view/AccessibilityBridge$Flag;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lio/flutter/view/AccessibilityBridge$Flag;->HAS_TOGGLED_STATE:Lio/flutter/view/AccessibilityBridge$Flag;

    new-instance v3, Lio/flutter/view/AccessibilityBridge$Flag;

    const/high16 v12, 0x20000

    const-string v15, "IS_TOGGLED"

    move-object/from16 v20, v2

    const/16 v2, 0x11

    invoke-direct {v3, v15, v2, v12}, Lio/flutter/view/AccessibilityBridge$Flag;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lio/flutter/view/AccessibilityBridge$Flag;->IS_TOGGLED:Lio/flutter/view/AccessibilityBridge$Flag;

    new-instance v12, Lio/flutter/view/AccessibilityBridge$Flag;

    const/high16 v15, 0x40000

    const-string v2, "HAS_IMPLICIT_SCROLLING"

    move-object/from16 v21, v3

    const/16 v3, 0x12

    invoke-direct {v12, v2, v3, v15}, Lio/flutter/view/AccessibilityBridge$Flag;-><init>(Ljava/lang/String;II)V

    sput-object v12, Lio/flutter/view/AccessibilityBridge$Flag;->HAS_IMPLICIT_SCROLLING:Lio/flutter/view/AccessibilityBridge$Flag;

    new-instance v2, Lio/flutter/view/AccessibilityBridge$Flag;

    const/high16 v15, 0x80000

    const-string v3, "IS_MULTILINE"

    move-object/from16 v22, v12

    const/16 v12, 0x13

    invoke-direct {v2, v3, v12, v15}, Lio/flutter/view/AccessibilityBridge$Flag;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lio/flutter/view/AccessibilityBridge$Flag;->IS_MULTILINE:Lio/flutter/view/AccessibilityBridge$Flag;

    new-instance v3, Lio/flutter/view/AccessibilityBridge$Flag;

    const/high16 v15, 0x100000

    const-string v12, "IS_READ_ONLY"

    move-object/from16 v23, v2

    const/16 v2, 0x14

    invoke-direct {v3, v12, v2, v15}, Lio/flutter/view/AccessibilityBridge$Flag;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lio/flutter/view/AccessibilityBridge$Flag;->IS_READ_ONLY:Lio/flutter/view/AccessibilityBridge$Flag;

    new-instance v12, Lio/flutter/view/AccessibilityBridge$Flag;

    const/high16 v15, 0x200000

    const-string v2, "IS_FOCUSABLE"

    move-object/from16 v24, v3

    const/16 v3, 0x15

    invoke-direct {v12, v2, v3, v15}, Lio/flutter/view/AccessibilityBridge$Flag;-><init>(Ljava/lang/String;II)V

    sput-object v12, Lio/flutter/view/AccessibilityBridge$Flag;->IS_FOCUSABLE:Lio/flutter/view/AccessibilityBridge$Flag;

    new-instance v2, Lio/flutter/view/AccessibilityBridge$Flag;

    const/16 v15, 0x16

    const/high16 v3, 0x400000

    move-object/from16 v25, v12

    const-string v12, "IS_LINK"

    invoke-direct {v2, v12, v15, v3}, Lio/flutter/view/AccessibilityBridge$Flag;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lio/flutter/view/AccessibilityBridge$Flag;->IS_LINK:Lio/flutter/view/AccessibilityBridge$Flag;

    new-instance v3, Lio/flutter/view/AccessibilityBridge$Flag;

    const/16 v12, 0x17

    const/high16 v15, 0x800000

    move-object/from16 v26, v2

    const-string v2, "IS_SLIDER"

    invoke-direct {v3, v2, v12, v15}, Lio/flutter/view/AccessibilityBridge$Flag;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lio/flutter/view/AccessibilityBridge$Flag;->IS_SLIDER:Lio/flutter/view/AccessibilityBridge$Flag;

    new-instance v2, Lio/flutter/view/AccessibilityBridge$Flag;

    const/16 v12, 0x18

    const/high16 v15, 0x1000000

    move-object/from16 v27, v3

    const-string v3, "IS_KEYBOARD_KEY"

    invoke-direct {v2, v3, v12, v15}, Lio/flutter/view/AccessibilityBridge$Flag;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lio/flutter/view/AccessibilityBridge$Flag;->IS_KEYBOARD_KEY:Lio/flutter/view/AccessibilityBridge$Flag;

    new-instance v3, Lio/flutter/view/AccessibilityBridge$Flag;

    const/16 v12, 0x19

    const/high16 v15, 0x2000000

    move-object/from16 v28, v2

    const-string v2, "IS_CHECK_STATE_MIXED"

    invoke-direct {v3, v2, v12, v15}, Lio/flutter/view/AccessibilityBridge$Flag;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lio/flutter/view/AccessibilityBridge$Flag;->IS_CHECK_STATE_MIXED:Lio/flutter/view/AccessibilityBridge$Flag;

    const/16 v2, 0x1a

    new-array v2, v2, [Lio/flutter/view/AccessibilityBridge$Flag;

    const/4 v12, 0x0

    aput-object v0, v2, v12

    const/4 v0, 0x1

    aput-object v1, v2, v0

    const/4 v0, 0x2

    aput-object v4, v2, v0

    const/4 v0, 0x3

    aput-object v6, v2, v0

    const/4 v0, 0x4

    aput-object v8, v2, v0

    const/4 v0, 0x5

    aput-object v11, v2, v0

    const/4 v0, 0x6

    aput-object v13, v2, v0

    const/4 v0, 0x7

    aput-object v14, v2, v0

    const/16 v0, 0x8

    aput-object v7, v2, v0

    const/16 v0, 0x9

    aput-object v9, v2, v0

    const/16 v0, 0xa

    aput-object v10, v2, v0

    const/16 v0, 0xb

    aput-object v5, v2, v0

    const/16 v0, 0xc

    aput-object v16, v2, v0

    const/16 v0, 0xd

    aput-object v17, v2, v0

    const/16 v0, 0xe

    aput-object v18, v2, v0

    const/16 v0, 0xf

    aput-object v19, v2, v0

    const/16 v0, 0x10

    aput-object v20, v2, v0

    const/16 v0, 0x11

    aput-object v21, v2, v0

    const/16 v0, 0x12

    aput-object v22, v2, v0

    const/16 v0, 0x13

    aput-object v23, v2, v0

    const/16 v0, 0x14

    aput-object v24, v2, v0

    const/16 v0, 0x15

    aput-object v25, v2, v0

    const/16 v0, 0x16

    aput-object v26, v2, v0

    const/16 v0, 0x17

    aput-object v27, v2, v0

    const/16 v0, 0x18

    aput-object v28, v2, v0

    const/16 v0, 0x19

    aput-object v3, v2, v0

    sput-object v2, Lio/flutter/view/AccessibilityBridge$Flag;->$VALUES:[Lio/flutter/view/AccessibilityBridge$Flag;

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

    iput p3, p0, Lio/flutter/view/AccessibilityBridge$Flag;->value:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lio/flutter/view/AccessibilityBridge$Flag;
    .locals 1

    const-class v0, Lio/flutter/view/AccessibilityBridge$Flag;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/flutter/view/AccessibilityBridge$Flag;

    return-object p0
.end method

.method public static values()[Lio/flutter/view/AccessibilityBridge$Flag;
    .locals 1

    sget-object v0, Lio/flutter/view/AccessibilityBridge$Flag;->$VALUES:[Lio/flutter/view/AccessibilityBridge$Flag;

    invoke-virtual {v0}, [Lio/flutter/view/AccessibilityBridge$Flag;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/flutter/view/AccessibilityBridge$Flag;

    return-object v0
.end method
