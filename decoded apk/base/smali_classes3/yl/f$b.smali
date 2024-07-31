.class public final Lyl/f$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lyl/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/g;)V
    .locals 0

    invoke-direct {p0}, Lyl/f$b;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lyl/m;
    .locals 1

    invoke-static {}, Lyl/f;->f()Lyl/m;

    move-result-object v0

    return-object v0
.end method
