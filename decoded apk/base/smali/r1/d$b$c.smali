.class final Lr1/d$b$c;
.super Lkotlin/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lok/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr1/d$b;->z()I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/o;",
        "Lok/l<",
        "Lv1/m;",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lr1/d$b$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lr1/d$b$c;

    invoke-direct {v0}, Lr1/d$b$c;-><init>()V

    sput-object v0, Lr1/d$b$c;->a:Lr1/d$b$c;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/o;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lv1/m;)Ljava/lang/Integer;
    .locals 1

    const-string v0, "obj"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lv1/m;->z()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lv1/m;

    invoke-virtual {p0, p1}, Lr1/d$b$c;->a(Lv1/m;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method
