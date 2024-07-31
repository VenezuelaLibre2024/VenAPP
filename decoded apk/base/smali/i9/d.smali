.class public Li9/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Landroid/os/Bundle;

.field private final c:Landroid/os/Bundle;

.field private final d:Landroid/content/Context;

.field private final e:Z

.field private final f:I

.field private final g:I

.field private final h:Ljava/lang/String;

.field private final i:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;ZLandroid/location/Location;IILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Li9/d;->a:Ljava/lang/String;

    iput-object p3, p0, Li9/d;->b:Landroid/os/Bundle;

    iput-object p4, p0, Li9/d;->c:Landroid/os/Bundle;

    iput-object p1, p0, Li9/d;->d:Landroid/content/Context;

    iput-boolean p5, p0, Li9/d;->e:Z

    iput p7, p0, Li9/d;->f:I

    iput p8, p0, Li9/d;->g:I

    iput-object p9, p0, Li9/d;->h:Ljava/lang/String;

    iput-object p10, p0, Li9/d;->i:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Li9/d;->a:Ljava/lang/String;

    return-object v0
.end method

.method public b()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Li9/d;->d:Landroid/content/Context;

    return-object v0
.end method

.method public c()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Li9/d;->b:Landroid/os/Bundle;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Li9/d;->i:Ljava/lang/String;

    return-object v0
.end method

.method public e()I
    .locals 1

    iget v0, p0, Li9/d;->f:I

    return v0
.end method
