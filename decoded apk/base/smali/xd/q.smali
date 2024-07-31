.class public Lxd/q;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lde/i;

.field private final b:Lud/l;

.field private final c:Landroid/app/Application;


# direct methods
.method public constructor <init>(Lde/i;Lud/l;Landroid/app/Application;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxd/q;->a:Lde/i;

    iput-object p2, p0, Lxd/q;->b:Lud/l;

    iput-object p3, p0, Lxd/q;->c:Landroid/app/Application;

    return-void
.end method


# virtual methods
.method a()Lud/l;
    .locals 1

    iget-object v0, p0, Lxd/q;->b:Lud/l;

    return-object v0
.end method

.method b()Lde/i;
    .locals 1

    iget-object v0, p0, Lxd/q;->a:Lde/i;

    return-object v0
.end method

.method public c()Landroid/view/LayoutInflater;
    .locals 2

    iget-object v0, p0, Lxd/q;->c:Landroid/app/Application;

    const-string v1, "layout_inflater"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/LayoutInflater;

    return-object v0
.end method
