.class final Lh8/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh8/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# static fields
.field private static final c:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "Lh8/c$a;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Lg8/b;

.field public final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lh8/b;

    invoke-direct {v0}, Lh8/b;-><init>()V

    sput-object v0, Lh8/c$a;->c:Ljava/util/Comparator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/CharSequence;Landroid/text/Layout$Alignment;FIIFIFZII)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lg8/b$b;

    invoke-direct {v0}, Lg8/b$b;-><init>()V

    invoke-virtual {v0, p1}, Lg8/b$b;->o(Ljava/lang/CharSequence;)Lg8/b$b;

    move-result-object p1

    invoke-virtual {p1, p2}, Lg8/b$b;->p(Landroid/text/Layout$Alignment;)Lg8/b$b;

    move-result-object p1

    invoke-virtual {p1, p3, p4}, Lg8/b$b;->h(FI)Lg8/b$b;

    move-result-object p1

    invoke-virtual {p1, p5}, Lg8/b$b;->i(I)Lg8/b$b;

    move-result-object p1

    invoke-virtual {p1, p6}, Lg8/b$b;->k(F)Lg8/b$b;

    move-result-object p1

    invoke-virtual {p1, p7}, Lg8/b$b;->l(I)Lg8/b$b;

    move-result-object p1

    invoke-virtual {p1, p8}, Lg8/b$b;->n(F)Lg8/b$b;

    move-result-object p1

    if-eqz p9, :cond_0

    invoke-virtual {p1, p10}, Lg8/b$b;->s(I)Lg8/b$b;

    :cond_0
    invoke-virtual {p1}, Lg8/b$b;->a()Lg8/b;

    move-result-object p1

    iput-object p1, p0, Lh8/c$a;->a:Lg8/b;

    iput p11, p0, Lh8/c$a;->b:I

    return-void
.end method

.method public static synthetic a(Lh8/c$a;Lh8/c$a;)I
    .locals 0

    invoke-static {p0, p1}, Lh8/c$a;->c(Lh8/c$a;Lh8/c$a;)I

    move-result p0

    return p0
.end method

.method static synthetic b()Ljava/util/Comparator;
    .locals 1

    sget-object v0, Lh8/c$a;->c:Ljava/util/Comparator;

    return-object v0
.end method

.method private static synthetic c(Lh8/c$a;Lh8/c$a;)I
    .locals 0

    iget p1, p1, Lh8/c$a;->b:I

    iget p0, p0, Lh8/c$a;->b:I

    invoke-static {p1, p0}, Ljava/lang/Integer;->compare(II)I

    move-result p0

    return p0
.end method
