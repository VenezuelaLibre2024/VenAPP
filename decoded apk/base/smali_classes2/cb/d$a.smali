.class public final Lcb/d$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcb/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:Z

.field private b:Ljava/lang/String;

.field private c:Lcb/a;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static bridge synthetic d(Lcb/d$a;)Lcb/a;
    .locals 0

    iget-object p0, p0, Lcb/d$a;->c:Lcb/a;

    return-object p0
.end method

.method static bridge synthetic e(Lcb/d$a;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcb/d$a;->b:Ljava/lang/String;

    return-object p0
.end method

.method static bridge synthetic f(Lcb/d$a;)Z
    .locals 0

    iget-boolean p0, p0, Lcb/d$a;->a:Z

    return p0
.end method


# virtual methods
.method public a()Lcb/d;
    .locals 2
    .annotation build Landroidx/annotation/RecentlyNonNull;
    .end annotation

    new-instance v0, Lcb/d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcb/d;-><init>(Lcb/d$a;Lcb/h;)V

    return-object v0
.end method

.method public b(Lcb/a;)Lcb/d$a;
    .locals 0
    .annotation build Landroidx/annotation/RecentlyNonNull;
    .end annotation

    iput-object p1, p0, Lcb/d$a;->c:Lcb/a;

    return-object p0
.end method

.method public c(Z)Lcb/d$a;
    .locals 0
    .annotation build Landroidx/annotation/RecentlyNonNull;
    .end annotation

    iput-boolean p1, p0, Lcb/d$a;->a:Z

    return-object p0
.end method
