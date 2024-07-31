.class public La9/b;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field private a:Lx8/p;

.field private b:Landroid/widget/ImageView$ScaleType;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public setImageScaleType(Landroid/widget/ImageView$ScaleType;)V
    .locals 0

    iput-object p1, p0, La9/b;->b:Landroid/widget/ImageView$ScaleType;

    return-void
.end method

.method public setMediaContent(Lx8/p;)V
    .locals 0

    iput-object p1, p0, La9/b;->a:Lx8/p;

    return-void
.end method
