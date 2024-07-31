.class public final Lpi/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpi/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/g;)V
    .locals 0

    invoke-direct {p0}, Lpi/a$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)Lpi/a;
    .locals 1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_3

    if-eqz p1, :cond_2

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    sparse-switch p1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget-object p1, Lpi/a;->AZTEC:Lpi/a;

    goto :goto_1

    :sswitch_1
    sget-object p1, Lpi/a;->PDF417:Lpi/a;

    goto :goto_1

    :sswitch_2
    sget-object p1, Lpi/a;->UPC_E:Lpi/a;

    goto :goto_1

    :sswitch_3
    sget-object p1, Lpi/a;->UPC_A:Lpi/a;

    goto :goto_1

    :sswitch_4
    sget-object p1, Lpi/a;->QR_CODE:Lpi/a;

    goto :goto_1

    :sswitch_5
    sget-object p1, Lpi/a;->ITF:Lpi/a;

    goto :goto_1

    :sswitch_6
    sget-object p1, Lpi/a;->EAN_8:Lpi/a;

    goto :goto_1

    :sswitch_7
    sget-object p1, Lpi/a;->EAN_13:Lpi/a;

    goto :goto_1

    :sswitch_8
    sget-object p1, Lpi/a;->DATA_MATRIX:Lpi/a;

    goto :goto_1

    :sswitch_9
    sget-object p1, Lpi/a;->CODABAR:Lpi/a;

    goto :goto_1

    :sswitch_a
    sget-object p1, Lpi/a;->CODE_93:Lpi/a;

    goto :goto_1

    :cond_0
    sget-object p1, Lpi/a;->CODE_39:Lpi/a;

    goto :goto_1

    :cond_1
    sget-object p1, Lpi/a;->CODE_128:Lpi/a;

    goto :goto_1

    :cond_2
    sget-object p1, Lpi/a;->ALL_FORMATS:Lpi/a;

    goto :goto_1

    :cond_3
    :goto_0
    sget-object p1, Lpi/a;->UNKNOWN:Lpi/a;

    :goto_1
    return-object p1

    :sswitch_data_0
    .sparse-switch
        0x4 -> :sswitch_a
        0x8 -> :sswitch_9
        0x10 -> :sswitch_8
        0x20 -> :sswitch_7
        0x40 -> :sswitch_6
        0x80 -> :sswitch_5
        0x100 -> :sswitch_4
        0x200 -> :sswitch_3
        0x400 -> :sswitch_2
        0x800 -> :sswitch_1
        0x1000 -> :sswitch_0
    .end sparse-switch
.end method
