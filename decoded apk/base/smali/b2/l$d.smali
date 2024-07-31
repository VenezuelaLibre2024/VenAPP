.class Lb2/l$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb2/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "d"
.end annotation


# instance fields
.field a:Landroid/view/View;

.field b:Ljava/lang/String;

.field c:Lb2/s;

.field d:Lb2/p0;

.field e:Lb2/l;


# direct methods
.method constructor <init>(Landroid/view/View;Ljava/lang/String;Lb2/l;Lb2/p0;Lb2/s;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb2/l$d;->a:Landroid/view/View;

    iput-object p2, p0, Lb2/l$d;->b:Ljava/lang/String;

    iput-object p5, p0, Lb2/l$d;->c:Lb2/s;

    iput-object p4, p0, Lb2/l$d;->d:Lb2/p0;

    iput-object p3, p0, Lb2/l$d;->e:Lb2/l;

    return-void
.end method
