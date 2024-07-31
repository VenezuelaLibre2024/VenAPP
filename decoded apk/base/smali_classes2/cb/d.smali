.class public Lcb/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcb/d$a;
    }
.end annotation


# instance fields
.field private final a:Z

.field private final b:Ljava/lang/String;

.field private final c:Lcb/a;


# direct methods
.method synthetic constructor <init>(Lcb/d$a;Lcb/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcb/d$a;->f(Lcb/d$a;)Z

    move-result p2

    iput-boolean p2, p0, Lcb/d;->a:Z

    invoke-static {p1}, Lcb/d$a;->e(Lcb/d$a;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcb/d;->b:Ljava/lang/String;

    invoke-static {p1}, Lcb/d$a;->d(Lcb/d$a;)Lcb/a;

    move-result-object p1

    iput-object p1, p0, Lcb/d;->c:Lcb/a;

    return-void
.end method


# virtual methods
.method public a()Lcb/a;
    .locals 1
    .annotation build Landroidx/annotation/RecentlyNullable;
    .end annotation

    iget-object v0, p0, Lcb/d;->c:Lcb/a;

    return-object v0
.end method

.method public b()Z
    .locals 1

    iget-boolean v0, p0, Lcb/d;->a:Z

    return v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/RecentlyNullable;
    .end annotation

    iget-object v0, p0, Lcb/d;->b:Ljava/lang/String;

    return-object v0
.end method
