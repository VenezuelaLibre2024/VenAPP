.class public Lbj/e$g$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbj/e$g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbj/e$g$c$a;
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/Integer;

.field public final b:Ljava/lang/Integer;

.field public final c:Ljava/lang/Integer;

.field public final d:Ljava/lang/Integer;


# direct methods
.method constructor <init>(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbj/e$g$c;->a:Ljava/lang/Integer;

    iput-object p2, p0, Lbj/e$g$c;->b:Ljava/lang/Integer;

    iput-object p3, p0, Lbj/e$g$c;->c:Ljava/lang/Integer;

    iput-object p4, p0, Lbj/e$g$c;->d:Ljava/lang/Integer;

    return-void
.end method
