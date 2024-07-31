.class Lb2/x;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Z = true


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method static a(Landroid/view/ViewGroup;)Lb2/v;
    .locals 1

    new-instance v0, Lb2/u;

    invoke-direct {v0, p0}, Lb2/u;-><init>(Landroid/view/ViewGroup;)V

    return-object v0
.end method

.method private static b(Landroid/view/ViewGroup;Z)V
    .locals 1

    sget-boolean v0, Lb2/x;->a:Z

    if-eqz v0, :cond_0

    :try_start_0
    invoke-static {p0, p1}, Lb2/w;->a(Landroid/view/ViewGroup;Z)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p0, 0x0

    sput-boolean p0, Lb2/x;->a:Z

    :cond_0
    :goto_0
    return-void
.end method

.method static c(Landroid/view/ViewGroup;Z)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    invoke-static {p0, p1}, Lb2/w;->a(Landroid/view/ViewGroup;Z)V

    goto :goto_0

    :cond_0
    invoke-static {p0, p1}, Lb2/x;->b(Landroid/view/ViewGroup;Z)V

    :goto_0
    return-void
.end method
