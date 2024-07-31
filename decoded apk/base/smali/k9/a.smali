.class public Lk9/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Ljava/util/List;

.field private final c:Landroid/os/Bundle;

.field private final d:Lx8/i;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/List;Landroid/os/Bundle;Lx8/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Li9/n;",
            ">;",
            "Landroid/os/Bundle;",
            "Lx8/i;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk9/a;->a:Landroid/content/Context;

    iput-object p2, p0, Lk9/a;->b:Ljava/util/List;

    iput-object p3, p0, Lk9/a;->c:Landroid/os/Bundle;

    iput-object p4, p0, Lk9/a;->d:Lx8/i;

    return-void
.end method


# virtual methods
.method public a()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lk9/a;->a:Landroid/content/Context;

    return-object v0
.end method
