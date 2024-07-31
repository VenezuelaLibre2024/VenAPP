.class abstract Laj/c$c;
.super Lvi/g$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Laj/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x40a
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lvi/g$a<",
        "TT;>;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lvi/g$a;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Laj/c$a;)V
    .locals 0

    invoke-direct {p0}, Laj/c$c;-><init>()V

    return-void
.end method


# virtual methods
.method abstract e()V
.end method
